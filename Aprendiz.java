package starWars;

public class Aprendiz extends Sith {

	public void descricao() {
		System.out.println("O Aprendiz na ordem Sith deve ser treinado por um Lorde, sendo que " + 
				"um marco importante desse estagio era se o Aprendiz ja tinha conhecimento para " + 
				"construir seu sabre de luz");
	}
	
	public void InfosPessoais() {
		System.out.println("Esse eh o Aprendiz " + nome + ", tambem conhecido por" + nomeSith
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
