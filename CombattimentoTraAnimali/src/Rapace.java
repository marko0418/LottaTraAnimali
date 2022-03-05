
public class Rapace extends Uccelli{

	public Rapace() {
		
		super("Rapace",
			 (int) (Math.random()*(40-30+1)+30), 
			 30,
			 100,
			 10, 
			 30,
			 100,
			 30,
			 (Math.random()*(0.6-0.4+1)+0.4), 
			 (Math.random()*(0.8-0.6+1)+0.6), 
			 (Math.random()*(0.57-0.51+1)+0.51), 
			 (int) (Math.random()*(1-0.5+1)+0.5)
			 );
		abilitaPassiva();
	}
	
	public void attaccoSpeciale(Animale a, int turno) {//picchiata
		int x;
		x = (int) (Math.random()*(10-5+1)+5);
		this.dann += x;
		x = (int) (Math.random()*(2-1+1)+1);
		this.ener-=x;
		System.out.print("L'attacco di " + this.nome + " va a segno, gli hp passano da: " + a.hp);
		a.hp-=(this.dann + this.atk);
		System.out.println(" a: " + a.hp);
	}
	public void abilitaPassiva() {
		//volare
		int x;
		x = (int) (Math.random()*(10-5+1)+5);
		this.vel += x;
	}
}
