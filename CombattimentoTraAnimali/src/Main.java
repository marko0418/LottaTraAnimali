
public class Main {

	public static void main(String[] args) {
		Animale a1;
		Animale a2;
	
	   
	
		Combattimento c1 = new Combattimento();
		a1 = Combattimento.randomA();
		do {
			a2 = Combattimento.randomA();
		}while(a1.nome == a2.nome);
	
		Terreno t1 = Combattimento.randomT();
		c1.storyTelling(a1, a2, t1);
		
		c1.scontro(a1, a2, t1);
		System.out.println("\n~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~\n");

		c1.gabbia(a1);
		c1.gabbia(a2);
		
	}

}
