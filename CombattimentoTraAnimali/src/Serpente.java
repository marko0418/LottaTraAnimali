
public class Serpente extends Anfibi{

	public Serpente() {
		super("Serpente",
				(int) (Math.random()*(10.6-8+1)+8), 
				32,
				1000,
				10, 
				42,
				42,
				42,
				(Math.random()*(40-20+1)+20), 
				(Math.random()*(40-20+1)+20), 
				(Math.random()*(8-5+1)+5), 
				(int) (Math.random()*(100-30+1)+30)
				);
		abilitaPassiva();
	}
	public void attaccoSpeciale(Animale a, int turno) {
		System.out.println(this.nome + " usa veleno");
		int x;
		int prob;
		x = (int) (Math.random()*(10-5+1)+5);
		this.dann += x;
		prob =  (int) (Math.random()*(100-0+1)+0);
		
		System.out.print("L'attacco di " + this.nome + " va a segno, gli hp passano da: " + a.hp);
		a.hp-=(this.dann + this.atk);
		if(prob <=5) {
			a.hp = 0;
		}
		if(a.hp<=0) {
			a.hp = 0;
		}
		System.out.println(" a: " + a.hp);
		
		if(prob <=5) {
			System.out.println(this.nome + " manda il nemico KO");
		}
		
		this.ener --;
	}
	public void abilitaPassiva() {	
		int x;
		x = (int) (Math.random()*(10-5+1)+5);
		this.atk += x;
	}
}
