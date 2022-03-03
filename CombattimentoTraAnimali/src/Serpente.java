
public class Serpente extends Anfibi{

	public Serpente(String n, int v, int f, int h, int e, int a, int d, int dan, double alt, double lar, double lun, double pes) {
		super("Serpente",
				(int) (Math.random()*(10.6-8+1)+8), 
				(int) (Math.random()*(100-70+1)+70),
				10,
				10, 
				0,
				0,
				0,
				(Math.random()*(40-20+1)+20), 
				(Math.random()*(40-20+1)+20), 
				(Math.random()*(8-5+1)+5), 
				(int) (Math.random()*(100-30+1)+30)
				);
		abilitaPassiva();
	}
	public void abilitaSpeciale(Animale a) {
		int x;
		int prob;
		x = (int) (Math.random()*(10-5+1)+5);
		this.dann += x;
		prob =  (int) (Math.random()*(100-0+1)+0);
		if(prob <=5) {
			a.hp = 0;
		}
	}
	public void abilitaPasiva() {
		
		int x;
		System.out.println(this.nome + " usa morsoRapido");
		x = (int) (Math.random()*(10-5+1)+5);
		this.atk += x;
	}
}
