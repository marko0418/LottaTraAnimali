
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
		
		
		c1.scontro(a1, a2, t1);
		
	}

}
