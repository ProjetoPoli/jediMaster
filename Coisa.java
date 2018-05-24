package starWars;

public abstract class Coisa {
	protected String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	abstract public void descricao();
}
