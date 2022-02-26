
public class Struzzo extends Uccelli{


	public Struzzo(int v, int f, int h, int e, int a, int d, int dan, double alt, double lar, double lun, double pes) {
		
		super((int) (Math.random()*(100-70+1)+70), 
			 (int) (Math.random()*(100-70+1)+70),
			 10,
			 10, 
			 0,
			 0,
			 0,
			 (Math.random()*(3-2+1)+2), 
			 (Math.random()*(2-1.5+1)+1.5),
			 (Math.random()*(2.2-1.8+1)+1.8), 
			 (int) (Math.random()*(140-63+1)+63)
			 );
		abilita();
	}
	
	public void abilita(Animale Nemico) {//testaSottoLaSabbia
		int x;
		x = (int) (Math.random()*(20-5+1)+5);
		this.def+=x;
		x = (int) (Math.random()*(100-0+1)+0);
		if(this.ener<10 && x<=50) {
			this.ener+=1;
		}
	}
}
