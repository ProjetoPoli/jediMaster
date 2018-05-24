package starWars;

public class PessoaComum extends SerVivo {
	
	private String ladoJediOuSith;
	
	public String getLadoJediOuSith() {
		return ladoJediOuSith;
	}

	public void setLadoJediOuSith(String ladoJediOuSith) {
		this.ladoJediOuSith = ladoJediOuSith;
	}

	public void descricao() {
		System.out.println("Uma pessoa comum nao eh nem Jedi nem Sith. Ela nao tem midichlorians o suficiente. Mesmo assim, muitos ja participaram de batalhas "
				+ "para decidir o destino da galaxia.");
	}

	void InfosPessoais() {
		System.out.println("Esse eh " + nome + ", que nasceu em " + localDeNascimento + ", no ano " + anoDeNascimento + 
				' ' + epocaDeNascimento +". Apesar de nao ser Jedi nem Sith, esta do lado dos " + ladoJediOuSith + '.');
	}

}
