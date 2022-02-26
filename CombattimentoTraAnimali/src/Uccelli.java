
public abstract class Uccelli extends Animale{
	
	public Uccelli(int v, int f, int h, int e, int a, int d, int dan, double alt, double lar, double lun, double pes) {
		super(v, f, h, e, a, d, dan, alt, lar, lun, pes);
	}
	public void abilita() {
		int x;
		x = (int) Math.random()*(10-5+1)+5;
		this.atk += x;
	}
}
