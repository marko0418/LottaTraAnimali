
public class Main {

	public static void main(String[] args) {
		Combattimento c1 = new Combattimento();
		Animale a1 = new Coccodrillo();
		Animale a2 = new Orso();
		Terreno t1 = new Pianura();
		c1.scontro(a1, a2, t1);
		
	}

}
