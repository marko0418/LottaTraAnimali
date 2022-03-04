
public class Fiume extends Terreno{

	public Fiume() {
		super("Fiume");
	}
	public void bonus(Animale a1) {
		if(a1 instanceof Anfibi) {
			int x;
			x = (int) (Math.random()*(10-5+1)+5);
			a1.atk += x;
			x = (int) (Math.random()*(10-5+1)+5);
			a1.dann += x;
		}
	}

}
