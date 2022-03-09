
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
	public static Animale randomA() {
		
		int k = (int) (Math.random()*(6-1+1)+1);
		
		
		switch(k) {//animale 1
		case 1:
			return new Rapace();
		case 2:
			return new Struzzo();
		case 3:
			return new Coccodrillo();
		case 4:
			return new Serpente();
		case 5:
			return new Leone();
		case 6:
			return new Orso();
		default:
			return null;
		}
	
	}
	public static Terreno randomT() {
		int k = (int) (Math.random()*(3-1+1)+1);
		switch(k) {
		case 1:
			return new Pianura();
		case 2:
			return new Fiume();
		case 3:
			return new Foresta();
		default:
			return null;
		}
		
	}
	
	public void scontro(Animale a1, Animale a2, Terreno t1) {
		int turn = 1;
		int presa = 0;
		int presa1 = 0;
		int k = 0;
		int v1 = 0;
		int d1 = 0;
		int v2 = 0;
		int d2 = 0;
		do {
			
			if(turn == 1) {
				t1.bonus(a1);
				t1.bonus(a2);		
				System.out.println("\n~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~\n");
				
				System.out.println("Energia " + a1.nome + ": " + a1.ener);
				System.out.println("Energia " + a2.nome + ": " + a2.ener);
				System.out.println("Terreno " + t1.nome );
				System.out.println("\n~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~\n");
			}
			
			if((a1.hp <= 0 || a2.hp <= 0) || (a1.ener <= 0 || a2.ener <= 0)) {
				vittoria = true;
			}else {
				System.out.println("Turno numero: " + turn);
				if(a1.nome == "Orso") {
					k = 1;
				}else if(a1.nome == "Coccodrillo" && presa == 1){
					k = 2;
				}else {
					k = (int) (Math.random()*(2-1+1)+1);
				}
				switch(k) {
				case 1:
					a1.attacco(a2);
					break;
				case 2:
					
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
						
						
					
					break;
				default:
						
				}
			}
			
			
			if((a1.hp <= 0 || a2.hp <= 0) || (a1.ener <= 0 || a2.ener <= 0)) {
				vittoria = true;
			}else {
				if(a2.nome == "Orso") {
					k = 1;
				}else if(a2.nome == "Coccodrillo" && presa1 == 1){
					k = 2;
				}else {
					k = (int) (Math.random()*(2-1+1)+1);
				}
				
				switch(k) {
				case 1:
					a2.attacco(a1);
					break;
				case 2:
					
						if(a2.nome == "Coccodrillo") {
							if(presa1 == 0) {
								
								v2 = a1.vel;
								d2 = a1.def;
								a2.attaccoSpeciale(a1, presa1);
								presa1 ++;
							}else if(presa1 == 1){
								a2.attaccoSpeciale(a1, presa1);
								a1.vel = v2;
								a1.def = d2;
								presa1 --;
							}
							
						}else {
							a2.attaccoSpeciale(a1, presa1);
						}
						
						
					
					break;
				default:
						
				}
				
			}
			if(a1.hp<=0 || a2.hp <=0) {
				
			}else {
				System.out.println("Energia " + a1.nome + ": " + a1.ener);
				System.out.println("Energia " + a2.nome + ": " + a2.ener);
				if(a1.ener <= 0 || a2.ener <= 0) {
					
				}else {
					System.out.println("\n~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~\n");
				}
				

			}
			turn++;	
		}while(vittoria == false);
		System.out.println("\n~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~~x~\n");
		if(a1.hp<=0) {
			System.out.println(a2.nome + " vince l'incontro");
		}else if(a2.hp<=0){
			System.out.println(a1.nome + " vince l'incontro");
		}else {
			
			if(a1.ener<=0 || a2.ener <= 0) {
				if(a1 instanceof Predatori) {
					System.out.println(a2.nome + " vince l'incontro");
				}else if(a2 instanceof Predatori) {
					System.out.println(a1.nome + " vince l'incontro");
				}else {
					if(a1.hp < a2.hp) {
						System.out.println(a2.nome + " ha più hp di " + a1.nome);
						System.out.println(a2.nome + " vince l'incontro");
					}else {
						System.out.println(a1.nome + " ha più hp di " + a2.nome);
						System.out.println(a1.nome + " vince l'incontro");
					}
				}
			}
		}
		
		
	}
	
}
