
public class Foresta extends Terreno{

	public Foresta(String t) {
		super("Foresta");
		
	}
	public void bonus(Animale a1) {
		if(a1.altezza * a1.lunghezza * a1.larghezza >= 2) {
			System.out.println(a1.nome);
		}
	}
}
