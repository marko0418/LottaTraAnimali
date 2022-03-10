
public class Leone extends Predatori{

	public Leone() {
		super("Leone",
				(int) (Math.random()*(80-60+1)+60), 
				 100,
				 1000,
				 10, 
				 55,
				 75,
				 55,
				 (Math.random()*(1.2-1+1)+1.2), 
				 (Math.random()*(0.6-0.4+1)+0.4), 
				 (Math.random()*(1.8-1.6+1)+1.6), 
				 (int) (Math.random()*(250-150+1)+150)
				 );	 
		abilitaPassiva();
	}
	public void abilitaPassiva() { //agilita + velocità
		int x;
		x = (int) (Math.random()*(10-5+1)+5);
		this.vel += x;
	}
	public void attaccoSpeciale(Animale a, int turno) {	//agguato 2 volte graffio e -1 ener ogni graffio
		
		System.out.println("-" + this.nome + " usa agguato, userà due volte graffio");
		attacco(a);
		if(a.hp != 0 && this.ener>0) {
			attacco(a);
		}
		if(this.ener <= 0 && a.hp > 0) {
			System.out.println(this.nome + " ha terminato l'energia");
		}
		
	}
}
