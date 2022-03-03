
public class Rapace extends Uccelli{

	public Rapace(String n, int v, int f, int h, int e, int a, int d, int dan, double alt, double lar, double lun, double pes) {
		
		super("Rapace",
				(int) (Math.random()*(40-30+1)+30), 
			 (int) (Math.random()*(100-70+1)+70),
			 10,
			 10, 
			 0,
			 0,
			 0,
			 (Math.random()*(0.6-0.4+1)+0.4), 
			 (Math.random()*(0.8-0.6+1)+0.6), 
			 (Math.random()*(0.57-0.51+1)+0.51), 
			 (int) (Math.random()*(1-0.5+1)+0.5)
			 );
		abilitaPassiva();
	}
	
	public void abilitaSpeciale(Animale Nemico) {//picchiata
		int x;
		x = (int) (Math.random()*(10-5+1)+5);
		this.dann += x;
		x = (int) (Math.random()*(2-1+1)+1);
		this.ener-=x;
	}
	public void abilitaPassiva() {
		//volare
		int x;
		x = (int) (Math.random()*(10-5+1)+5);
		this.vel += x;
	}
}
