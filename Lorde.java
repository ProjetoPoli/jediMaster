package starWars;

public class Lorde extends Sith {
	
	private int pontosDeVida;
	private int dominioDaForca;
	private int dominioDeSabre;
	private Habilidade[] habilidades = new Habilidade[4];
	int k = 0;

	public int getPontosDeVida() {
		return pontosDeVida;
	}

	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida % 1001;
	}

	public int getDominioDaForca() {
		return dominioDaForca;
	}

	public void setDominioDaForca(int dominioDaForca) {
		this.dominioDaForca = dominioDaForca % 11;
	}

	public int getDominioDeSabre() {
		return dominioDeSabre;
	}

	public void setDominioDeSabre(int dominioDeSabre) {
		this.dominioDeSabre = dominioDeSabre % 11;
	}

	public Habilidade[] getHabilidades() {
		return habilidades;
	}
	
	public void construirMestre(String nom, int vida, int forca, int sabre) {
		this.setNome(nom);
		this.setPontosDeVida(vida);
		this.setDominioDaForca(forca);
		this.setDominioDeSabre(sabre);
	}

	public void setHabilidades(Habilidade hab) {
		if (k < 4) {
			if (hab.isEhforca()) {
				hab.setDanoTotal(hab.getDanoBase()*dominioDaForca);
			}
			else {
				hab.setDanoTotal(hab.getDanoBase()*dominioDeSabre*1.5);
			}
			habilidades[k] = hab;
			k++;
		}
		else System.out.println("Esse mestre jedi ja tem quatro habilidades.");
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
