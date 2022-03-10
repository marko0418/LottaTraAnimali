
public class Foresta extends Terreno{

	public Foresta() {
		super("Foresta");
		
	}
	public void bonus(Animale a1) {
		int x;
		if((a1.altezza * a1.lunghezza * a1.larghezza >= 2) || a1.peso >= 250) {
			System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
			System.out.println(a1.nome + " è svantaggiato a causa dell'effetto di foresta");		
			System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
			x = (int) (Math.random()*(10-5+1)+5);
			a1.vel -= x;
			
		}else {
			System.out.println(a1.nome + " è avvantaggiato a causa dell'effetto di foresta");
			System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");

			
			x = (int) (Math.random()*(15-10+1)+10);
			a1.vel -= x;
		}
		
	}
}
