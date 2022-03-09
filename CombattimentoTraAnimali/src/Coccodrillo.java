
public class Coccodrillo extends Anfibi{

	public Coccodrillo() {
		super("Coccodrillo",
				(int) (Math.random()*(50-40+1)+40), 
				55,
				1000,
				10, 
				100,
				22,
				75,
				(Math.random()*(0.7-0.5+1)+0.5), 
				(Math.random()*(1-0.5+1)+0.5),
				(Math.random()*(7-5+1)+5), 
				(int) (Math.random()*(800-500+1)+500)
				);

	}
	public void attaccoSpeciale(Animale a, int turn) {//presaInMorso se turno == 1 turn resta false e danno non aumena ed energia non diminuisce mentre se turno = 2 si fa la condizione dell'if
		int x;
		if(turn == 0) {
			System.out.println(this.nome + " usa presa in morso");
			System.out.println("Attacco e velocità nemico si azzerano");
			a.atk = 0;
			a.vel = 0;
		}
		if(turn == 1) {
			x = (int) (Math.random()*(10-5+1)+5);
			this.dann += x;
			this.ener -= 1;
			System.out.print("Presa in morso di " + this.nome + " va a segno, gli hp passano da: " + a.hp);
			a.hp-=(this.dann + this.atk);
			if(a.hp<0) {
				a.hp = 0;
			}
			System.out.println(" a: " + a.hp);
			this.dann -= x;
			
		}
	}
}
