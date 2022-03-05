
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
		int turn = 0;
		int presa = 0;
		int k = 0;
		int v1 = 0;
		int d1 = 0;
		int v2 = 0;
		int d2 = 0;
		do {
			
			if(turn == 0) {
				t1.bonus(a1);
				t1.bonus(a2);
				turn++;
			}
			
			if((a1.hp <= 0 || a2.hp <= 0) || (a1.ener <= 0 || a2.ener <= 0)) {
				vittoria = true;
			}else {
				k = 2;
				switch(k) {
				case 1:
					a1.attacco(a2);
					break;
				case 2:
					if(turn==0) {
						turn++;
					}else {
						if(a1.nome == "Coccodrillo") {
							if(presa == 0) {
								v1 = a2.vel;
								d1 = a2.def;
								presa ++;
							}else {
								a1.attaccoSpeciale(a2, presa);
								a2.vel = v1;
								a2.def = d1;
							}
							
						}else {
							a1.attaccoSpeciale(a2, presa);
						}
						
						
					}
					break;
				default:
						
				}
			}
			if((a1.hp <= 0 || a2.hp <= 0) || (a1.ener <= 0 || a2.ener <= 0)) {
				vittoria = true;
			}else {
				k = (int) (Math.random()*(2-1+1)+1);
				switch(k) {
				case 1:
					a2.attacco(a1);
					break;
				case 2:
					a2.attaccoSpeciale(a1, turn);
					break;
				default:
						
				}
				
			}
			
			
		}while(vittoria == false);
		if(a1.hp<=0) {
			System.out.println(a2.nome + " vince l'incontro");
		}else {
			System.out.println(a1.nome + " vince l'incontro");

		}
		
	}
	
}
