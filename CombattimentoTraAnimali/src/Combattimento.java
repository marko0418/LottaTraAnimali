
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
	
	public void scontro(Animale a1, Animale a2, Terreno t1) {
		do {
			t1.bonus(a1);
			t1.bonus(a2);
			if((a1.hp <= 0 || a2.hp <= 0) || (a1.ener <= 0 || a2.ener <= 0)) {
				vittoria = true;
			}else {
				
				a1.attacco(a2);
			}
			if((a1.hp <= 0 || a2.hp <= 0) || (a1.ener <= 0 || a2.ener <= 0)) {
				vittoria = true;
			}else {
				a2.attacco(a1);
			}
			
			
		}while(vittoria == false);
		if(a1.ener<=0) {
			System.out.println(a2.nome + " vince l'incontro");
		}else {
			System.out.println(a1.nome + " vince l'incontro");

		}
		
	}
	
}
