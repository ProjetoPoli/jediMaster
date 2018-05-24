package starWars;

public class Lorde extends Sith {

	public Lorde(int data, String nom, String sex, String esp, String epoch, String loc, String nomS) {
		super(data, nom, sex, esp, epoch, loc, nomS);
		
	}

	@Override
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
