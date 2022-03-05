
public class Orso extends Predatori{

	public Orso() {
		super("Orso", 
				(int) (Math.random()*(60-45+1)+45), 
				 75,
				 100,
				 10, 
				 75,
				 55,
				 100,
				 (Math.random()*(1.5-0.7+1)+0.7), 
				 (Math.random()*(0.8-1.2+1)+0.8), 
				 (Math.random()*(2.8-1.4+1)+1.4), 
				 (int) (Math.random()*(600-450+1)+450)
				 );
		abilitaPassiva();
	}
	public void abilitaPassiva() {//pelliccia spessa e possanza
		int x;
		x = (int) (Math.random()*(20-5+1)+5);
		this.def += x;
		x = (int) (Math.random()*(20-5+1)+5);
		this.For += x;
	}
}
