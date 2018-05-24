package starWars;

public class Sith extends SerVivo{
	String nomeSith;
	
	Sith(int data, String nom, String sex, String esp, String epoch, String loc, String nomS) {
		super(data, nom, sex, esp, epoch, loc);
		nomeSith = nomS;
	}

	public void descricao() {
		System.out.println("Na ordem Sith deve-se adotar um novo\r\n" + 
				"nome,  evoluir  o  percentual  de  raiva  e  podem  ou  nao  ter  como  poderes  telepatia,\r\n" + 
				"telecinese e persuasao.  Conforme seu estagio de treinamento podem ser Aprendizes\r\n" + 
				"ou Lordes.");
		
	}

}
