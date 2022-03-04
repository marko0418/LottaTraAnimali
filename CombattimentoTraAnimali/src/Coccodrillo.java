
public class Coccodrillo extends Anfibi{

	public Coccodrillo() {
		super("Coccodrillo",
				(int) (Math.random()*(50-40+1)+40), 
				(int) (Math.random()*(100-70+1)+70),
				10,
				10, 
				1,
				1,
				1,
				(Math.random()*(0.7-0.5+1)+0.5), 
				(Math.random()*(1-0.5+1)+0.5),
				(Math.random()*(7-5+1)+5), 
				(int) (Math.random()*(800-500+1)+500)
				);

	}
	public void abilitaSpeciale(Animale a, boolean turn) {//presaInMorso se turno == 1 turn resta false e danno non aumena ed energia non diminuisce mentre se turno = 2 si fa la condizione dell'if
		int x;
		System.out.println(this.nome + "usa presa in morso");
		a.atk = 0;
		a.vel = 0;
		if(turn == true) {
			x = (int) (Math.random()*(10-5+1)+5);
			this.dann += x;
			this.ener -= 1;
			
		}
	}
}
