
public abstract class Terreno {
	protected String nome;
	public Terreno(String t) {
		this.nome = t;
	}
	
	public void bonus(Animale a) {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
