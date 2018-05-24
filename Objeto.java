package starWars;

public abstract class Objeto {
	private String nome;
	
	Objeto (String nom) {
		nome = nom;
	}
	
	abstract public String descricao();
}
