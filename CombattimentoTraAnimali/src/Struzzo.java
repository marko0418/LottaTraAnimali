
public class Struzzo extends Uccelli{


	public Struzzo() {
		
		super("Struzzo",
			 (int) (Math.random()*(100-70+1)+70), 
			 38,
			 1000,
			 10, 
			 22,
			 60,
			 30,
			 (Math.random()*(3-2+1)+2), 
			 (Math.random()*(2-1.5+1)+1.5),
			 (Math.random()*(2.2-1.8+1)+1.8), 
			 (int) (Math.random()*(140-63+1)+63)
			 );
		
	}
	
	public void attaccoSpeciale(Animale Nemico, int turn) {//testaSottoLaSabbia
		System.out.println("Struzzo usa Testa sotto la sabbia");
		int x;
		x = (int) (Math.random()*(20-5+1)+5);
		this.def+=x;
		System.out.println("Difesa di Struzzo aumenta");
		x = (int) (Math.random()*(100-0+1)+0);
		this.ener --;
		if(this.ener<10 && x<=50) {
			System.out.println("Struzzo recupera un punto di energia");
			this.ener+=1;
		}
	}
}
