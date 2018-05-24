package starWars;

public abstract class Objeto {
	protected String nome;
	
	Objeto (String nom) {
		nome = nom;
	}
	
	abstract public void descricao();
}
