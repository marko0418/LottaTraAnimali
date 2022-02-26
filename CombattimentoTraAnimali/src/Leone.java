
public class Leone extends Predatori{

	public Leone(int v, int f, int h, int e, int a, int d, int dan, double alt, double lar, double lun, double pes) {
		super((int) (Math.random()*(80-60+1)+60), 
				 (int) (Math.random()*(100-70+1)+70),
				 10,
				 10, 
				 0,
				 0,
				 0,
				 (Math.random()*(1.2-1+1)+1.2), 
				 (Math.random()*(0.6-0.4+1)+0.4), 
				 (Math.random()*(1.8-1.6+1)+1.6), 
				 (int) (Math.random()*(250-150+1)+150)
				 );
				 
	
	}

}
