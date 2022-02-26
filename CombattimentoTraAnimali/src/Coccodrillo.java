
public class Coccodrillo extends Anfibi{

	public Coccodrillo(int v, int f, int h, int e, int a, int d, int dan, double alt, double lar, double lun, double pes) {
		super((int) (Math.random()*(50-40+1)+40), 
				(int) (Math.random()*(100-70+1)+70),
				10,
				10, 
				0,
				0,
				0,
				(Math.random()*(0.7-0.5+1)+0.5), 
				(Math.random()*(1-0.5+1)+0.5),
				(Math.random()*(7-5+1)+5), 
				(int) (Math.random()*(800-500+1)+500)
				);

	}
	public void abilitaSpeciale(Animale a, boolean turn) {//presaInMorso
		int x;
		a.atk = 0;
		a.vel = 0;
		if(turn == true) {
			x = (int) (Math.random()*(10-5+1)+5);
			this.dann += x;
			this.ener -= 1;
			
		}
	}
}
