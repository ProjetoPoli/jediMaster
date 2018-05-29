package starWars;

public class Mestre extends Jedi{
	private boolean possuiVidencia;
	private long tamanhoVidencia;
	private boolean possuiImortalidade;
	private int pontosDeVida;
	private int dominioDaForca;
	private int dominioDeSabre;
	private int k = 0;
	private Habilidade[] habilidades = new Habilidade[4];

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

	public boolean isPossuiVidencia() {
		return possuiVidencia;
	}

	public void setPossuiVidencia(boolean possuiVidencia) {
		this.possuiVidencia = possuiVidencia;
	}

	public long getTamanhoVidencia() {
		return tamanhoVidencia;
	}

	public void setTamanhoVidencia(long tamanhoVidencia) {
		this.tamanhoVidencia = tamanhoVidencia;
	}

	public boolean isPossuiImortalidade() {
		return possuiImortalidade;
	}

	public void setPossuiImortalidade(boolean possuiImortalidade) {
		this.possuiImortalidade = possuiImortalidade;
	}

	public void descricao() {
		System.out.println("O Mestre na ordem Jedi eh um Cavaleiro que adquiriu um campo de videncia ou a imortalidade.");
	}
	
	public void InfosPessoais() {
		System.out.println("Esse eh o Mestre Jedi " + nome + ", que nasceu em " + localDeNascimento + ", no ano " + anoDeNascimento + ' ' + epocaDeNascimento +'.');
		if (sexo == "macho") {
			System.out.println("Ele eh um membro da especie " + especie + ", e eh do sexo masculino.");
		}
		if (sexo == "femea") {
			System.out.println("Ela eh um membro da especie " + especie + ", e eh do sexo feminino.");
		}
		else System.out.println("Eh um membro da especie " + especie + ".");
		if (possuiVidencia) System.out.println("Possui videncia de " + tamanhoVidencia + "anos-luz.");
		else System.out.println("Não possui videncia ");
		if (possuiImortalidade) System.out.print("e imortalidade.");
		else System.out.print("e não possui imortalidade.");
		if (!possuiVidencia && !possuiImortalidade) System.out.println("Esse Jedi nao deveria ser mestre.");
	}
}
