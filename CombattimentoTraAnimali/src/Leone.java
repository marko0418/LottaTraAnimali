
public class Leone extends Predatori{

	public Leone() {
		super("Leone",
				(int) (Math.random()*(80-60+1)+60), 
				 (int) (Math.random()*(100-70+1)+70),
				 10,
				 10, 
				 0,
				 0,
				 0,
				 (Math.random()*(1.2-1+1)+1.2), 
				 (Math.random()*(0.6-0.4+1)+0.4), 
				 (Math.random()*(1.8-1.6+1)+1.6), 
				 (int) (Math.random()*(250-150+1)+150)
				 );	 
		abilitaPassiva();
	}
	public void abilitaPassiva() { //agilita + velocità
		int x;
		System.out.println(this.nome + " usa agilità");
		x = (int) (Math.random()*(10-5+1)+5);
		this.vel += x;
	}
	public void abilitaSpeciale() {	//agguato 2 volte graffio e -1 ener ogni graffio
		System.out.println(this.nome + " usa agguato");
		Graffio();
		this.ener -= 1;
		Graffio();
		this.ener -= 1;
	}
}
