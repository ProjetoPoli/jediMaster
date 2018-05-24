package starWars;

public class Padawan extends Jedi {

	public Padawan(int data, String nom, String sex, String esp, String epoch, String loc) {
		super(data, nom, sex, esp, epoch, loc);
	}
	
	public void descricao() {
		System.out.println("Um Padawan na ordem Jedi deviam usar uma tranca quando tinham cabelo, sendo que um marco importante desse estagio era se o Padawan ja " + 
				"tinha conhecimento para construir seu sabre de luz.  O sabre de luz eh feito a partir" + 
				"de um tipo de cristal que gera uma lamina de uma determinada cor em contato com a manipulacao da forca.");
	}
	public void InfosPessoais() {
		System.out.println("Esse eh o Padawan " + nome + ", que nasceu em " + localDeNascimento + ", no ano " + anoDeNascimento + ' ' + epocaDeNascimento +'.');
		if (sexo == "macho") {
			System.out.println("Ele eh um membro da especie " + especie + ", e eh do sexo masculino.");
		}
		if (sexo == "femea") {
			System.out.println("Ela eh um membro da especie " + especie + ", e eh do sexo feminino.");
		}
		else System.out.println("Eh um membro da especie " + especie + ".");
	}

}
