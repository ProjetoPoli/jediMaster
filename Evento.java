package starWars;

public class Evento extends Coisa {
	private int dataEvento;
	private String epocaEvento;
	private String localEvento;
	private String descricaoEvento;
	private String[] envolvidos = new String[100];
	
	
	public int getDataEvento() {
		return dataEvento;
	}


	public void setDataEvento(int dataEvento) {
		this.dataEvento = dataEvento;
	}


	public String getEpocaEvento() {
		return epocaEvento;
	}


	public void setEpocaEvento(String epocaEvento) {
		this.epocaEvento = epocaEvento;
	}


	public String getLocalEvento() {
		return localEvento;
	}


	public void setLocalEvento(String localEvento) {
		this.localEvento = localEvento;
	}


	public String getDescricaoEvento() {
		return descricaoEvento;
	}


	public void setDescricaoEvento(String descricaoEvento) {
		this.descricaoEvento = descricaoEvento;
	}


	public String[] getEnvolvidos() {
		return envolvidos;
	}


	public void setEnvolvidos(String[] envolvidos) {
		this.envolvidos = envolvidos;
	}


	public void descricao() {
		System.out.println("Esse eh o evento " + nome +", que ocorreu em" + dataEvento +' ' + epocaEvento + " em " + localEvento + '.');
		System.out.println(descricaoEvento);
	}

}
