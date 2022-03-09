
public abstract class Animale { 
	protected String nome;
	protected int vel;
	protected int For;
	protected int hp;
	protected int ener;
	protected int atk;
	protected int def;
	protected int dann;
	protected double altezza;
	protected double larghezza;
	protected double lunghezza;
	protected double peso;
	public Animale(String n, int v, int f, int h, int e, int a, int d, int dan, double alt, double lar, double lun, double pes) {
		nome = n;
		vel = v; 
		For = f; 
		hp = h;
		ener = e;
		atk = a;
		def = d; 
		dann = dan;
		altezza = alt;
		larghezza = lar;
		lunghezza = lun;
		peso = pes;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVel() {
		return vel;
	}
	public void setVel(int vel) {
		this.vel = vel;
	}
	public int getFor() {
		return For;
	}
	public void setFor(int for1) {
		For = for1;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getEner() {
		return ener;
	}
	public void setEner(int ener) {
		this.ener = ener;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getDann() {
		return dann;
	}
	public void setDann(int dann) {
		this.dann = dann;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	public double getLarghezza() {
		return larghezza;
	}
	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}
	
	public double getLunghezza() {
		return lunghezza;
	}
	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}



	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void attacco(Animale a) {
		int x;
		
		x  = (int) (Math.random()*(20-0+1)+0);
		if(this.ener > 0) { // controllo se ho energia per attaccare
			this.ener -= 1;
			if(this.atk + this.For + this.vel + x > a.def + a.vel) { // controllo se puo attaccare
				System.out.print("L'attacco di " + this.nome + " va a segno, gli hp passano da: " + a.hp);
				a.hp-=(this.dann + this.atk);
				if(a.hp<0) {
					a.hp = 0;
				}
				System.out.println(" a: " + a.hp);
				
			}else {
				System.out.println(this.nome + " manca l'attacco");
			}
		}else {
			System.out.println(this.nome + " ha terminato l'energia");
		}
		
		
	}
	
	public void attaccoSpeciale(Animale a, int t) {
		
	}
	public void abilitaPassiva() {
		
	}



	



	
}
