
public class Leone extends Predatori{

	public Leone() {
		super("Leone",
				(int) (Math.random()*(80-60+1)+60), 
				 100,
				 100,
				 10, 
				 55,
				 75,
				 55,
				 (Math.random()*(1.2-1+1)+1.2), 
				 (Math.random()*(0.6-0.4+1)+0.4), 
				 (Math.random()*(1.8-1.6+1)+1.6), 
				 (int) (Math.random()*(250-150+1)+150)
				 );	 
		abilitaPassiva();
	}
	public void abilitaPassiva() { //agilita + velocità
		int x;
		System.out.println(this.nome + " usa agilità");
		x = (int) (Math.random()*(10-5+1)+5);
		this.vel += x;
	}
	public void attaccoSpeciale(Animale a, int turno) {	//agguato 2 volte graffio e -1 ener ogni graffio
		System.out.println(this.nome + " usa agguato");
		attacco(a);
		this.ener -= 1;
		attacco(a);
		this.ener -= 1;
		System.out.print("L'attacco di " + this.nome + " va a segno, gli hp passano da: " + a.hp);
		a.hp-=(this.dann + this.atk);
		System.out.println(" a: " + a.hp);
	}
}
