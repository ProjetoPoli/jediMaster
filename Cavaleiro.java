package starWars;

public class Cavaleiro extends Jedi{
	
	private int anoTornouCavaleiro;
	private String epocaTornouCavaleiro;

	public int getAnoTornouCavaleiro() {
		return anoTornouCavaleiro;
	}

	public void setAnoTornouCavaleiro(int anoTornouCavaleiro) {
		this.anoTornouCavaleiro = anoTornouCavaleiro;
	}

	public String getEpocaTornouCavaleiro() {
		return epocaTornouCavaleiro;
	}

	public void setEpocaTornouCavaleiro(String epocaTornouCavaleiro) {
		this.epocaTornouCavaleiro = epocaTornouCavaleiro;
	}

	public void descricao() {
		System.out.println("Cavaleiros na ordem Jedi eram os aprovados nos testes Jedi.");
	}
	
	public void InfosPessoais() {
		System.out.println("Esse eh o Cavaleiro " + nome + ", que nasceu em " + localDeNascimento + ", no ano " + anoDeNascimento + ' ' + epocaDeNascimento +'.');
		if (sexo == "macho") {
			System.out.println("Ele eh um membro da especie " + especie + ", e eh do sexo masculino.");
			System.out.print("Ele se tornou Cavaleiro Jedi em " + anoTornouCavaleiro + ' ' + epocaTornouCavaleiro + '.');
		}
		if (sexo == "femea") {
			System.out.println("Ela eh um membro da especie " + especie + ", e eh do sexo feminino.");
			System.out.print("Ela se tornou Cavaleira Jedi em " + anoTornouCavaleiro + ' ' + epocaTornouCavaleiro + '.');
		}
		else System.out.println("Eh um membro da especie " + especie + ".");
	}

}
