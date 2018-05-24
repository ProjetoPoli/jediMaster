package starWars;

public class Lorde extends Sith {

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
