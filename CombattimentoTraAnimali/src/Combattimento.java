
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
		int presa1 = 0;
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
				if(a1.nome == "Orso" || a1.nome == "Struzzo") {
					k = 1;
				}else {
					k = (int) (Math.random()*(2-1+1)+1);
				}
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
								a1.attaccoSpeciale(a2, presa);
								presa ++;
							}else if(presa == 1){
								a1.attaccoSpeciale(a2, presa);
								a2.vel = v1;
								a2.def = d1;
								presa --;
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
				if(a2.nome == "Orso" || a2.nome == "Struzzo") {
					k = 1;
				}else {
					k = (int) (Math.random()*(2-1+1)+1);
				}
				
				switch(k) {
				case 1:
					a2.attacco(a1);
					break;
				case 2:
					if(turn==0) {
						turn++;
					}else {
						if(a2.nome == "Coccodrillo") {
							if(presa1 == 0) {
								
								v2 = a1.vel;
								d2 = a1.def;
								a2.attaccoSpeciale(a1, presa);
								presa1 ++;
							}else if(presa1 == 1){
								a2.attaccoSpeciale(a1, presa);
								a1.vel = v2;
								a1.def = d2;
								presa1 --;
							}
							
						}else {
							a2.attaccoSpeciale(a1, presa);
						}
						
						
					}
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
