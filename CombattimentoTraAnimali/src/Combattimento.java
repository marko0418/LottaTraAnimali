
public class Combattimento {
	boolean vittoria;
	int turno;
	public Combattimento() {
		vittoria = false;
		turno = 0;
	}
	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
		this.turno = turno;
	}
	public boolean isVittoria() {
		return vittoria;
	}
	public void setVittoria(boolean vittoria) {
		this.vittoria = vittoria;
	}
	
	public void scontro(Animale a1, Animale a2) {
		do {
			a1.attacco(a2);
			a2.attacco(a1);
			if((a1.hp <= 0 || a2.hp <= 0) || (a1.ener <= 0 || a2.ener <= 0)) {
				vittoria = true;
			}
		}while(vittoria == false);
		
	}
	
}
