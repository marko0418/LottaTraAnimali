
public class Orso extends Predatori{

	public Orso(int v, int f, int h, int e, int a, int d, int dan, double alt, double lar, double lun, double pes) {
		super((int) (Math.random()*(60-45+1)+45), 
				 (int) (Math.random()*(100-70+1)+70),
				 10,
				 10, 
				 0,
				 0,
				 0,
				 (Math.random()*(1.5-0.7+1)+0.7), 
				 (Math.random()*(0.8-1.2+1)+0.8), 
				 (Math.random()*(2.8-1.4+1)+1.4), 
				 (int) (Math.random()*(600-450+1)+450)
				 );
	}

}