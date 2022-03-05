
public abstract class Predatori extends Animale{

	public Predatori(String n, int v, int f, int h, int e, int a, int d, int dan, double alt, double lar, double lun, double pes) {
		super(n, v, f, h, e, a, d, dan, alt, lar, lun, pes);
		
	}
	public void attacco(Animale a) {
		System.out.println(this.nome + " usa graffio");
		int x;
		x = (int) (Math.random()*(10-5+1)+5);
		this.dann += x;
		System.out.print("L'attacco di " + this.nome + " va a segno, gli hp passano da: " + a.hp);
		a.hp-=(this.dann + this.atk);
		System.out.println(" a: " + a.hp);
	}
}
