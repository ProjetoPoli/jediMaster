package starWars;

public class Lorde extends Sith {
	
	private int pontosDeVida;
	private int dominioDaForca;
	private int dominioDeSabre;
	private Habilidade[] habilidades = new Habilidade[4];

	public int getPontosDeVida() {
		return pontosDeVida;
	}

	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}

	public int getDominioDaForca() {
		return dominioDaForca;
	}

	public void setDominioDaForca(int dominioDaForca) {
		this.dominioDaForca = dominioDaForca;
	}

	public int getDominioDeSabre() {
		return dominioDeSabre;
	}

	public void setDominioDeSabre(int dominioDeSabre) {
		this.dominioDeSabre = dominioDeSabre;
	}

	public Habilidade[] getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(Habilidade[] habilidades) {
		this.habilidades = habilidades;
	}
	
	public void descricao() {
		System.out.println("Um Lorde Sith eh um Sith que passou por intenso treinamento e foi reconhecido por outros lordes.");
	}
	
	void InfosPessoais() {
		System.out.println("Esse eh o Lorde Sith " + nome + ", tambem conhecido por " + nomeSith
				+ ", que nasceu em " + localDeNascimento + ", no ano " + anoDeNascimento + ' ' + epocaDeNascimento +'.');
		if (sexo == "macho") {
			System.out.println("Ele eh um membro da especie " + especie + ", e eh do sexo masculino.");
		}
		if (sexo == "femea") {
			System.out.println("Ela eh um membro da especie " + especie + ", e eh do sexo feminino.");
		}
		else System.out.println("Eh um membro da especie " + especie + ".");
	}

}
