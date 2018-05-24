package starWars;

public abstract class Sith extends SerVivo{
	String nomeSith;
	
	public String getNomeSith() {
		return nomeSith;
	}


	public void setNomeSith(String nomeSith) {
		this.nomeSith = nomeSith;
	}

	public void descricao() {
		System.out.println("Na ordem Sith deve-se adotar um novo" + 
				"nome,  evoluir  o  percentual  de  raiva  e  podem  ou  nao  ter  como  poderes  telepatia," + 
				"telecinese e persuasao.  Conforme seu estagio de treinamento podem ser Aprendizes" + 
				"ou Lordes.");	
	} 
}
