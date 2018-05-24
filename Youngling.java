package starWars;

public class Youngling extends Jedi{

	String treinador;
	
	public String getTreinador() {
		return treinador;
	}

	public void setTreinador(String treinador) {
		this.treinador = treinador;
	}

	public void descricao() {
		System.out.println(" O Youngling ou iniciado na ordem Jedi era um ser crianca designada para treinamento em algum Cla, sempre treinado por um mestre da ordem Jedi. "
				+ "Um marco importante desse estagio era se o Youngling ja tinha feito a colheita de cristais para seus sabres de luz.");
	}
	
	public void InfosPessoais() {
		System.out.println("Esse eh o Youngling " + nome + ", que nasceu em " + localDeNascimento + ", no ano " + anoDeNascimento + ' ' + epocaDeNascimento +'.');
		if (sexo == "macho") {
			System.out.println("Ele eh um membro da especie " + especie + ", e eh do sexo masculino. ");
		}
		if (sexo == "femea") {
			System.out.println("Ela eh um membro da especie " + especie + ", e eh do sexo feminino.");
		}
		else System.out.println("Eh um membro da especie " + especie + ".");
		System.out.println("Seu mestre eh " +  treinador + '.');
	}
}
