package starWars;

public class Mestre extends Jedi{
	private boolean possuiVidencia;
	private long tamanhoVidencia;
	private boolean possuiImortalidade;

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
