package starWars;

public abstract class SerVivo extends Coisa{
	protected int anoDeNascimento;
	protected String epocaDeNascimento;
	protected String localDeNascimento;
	protected String sexo;
	protected String especie;
	
	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}

	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}

	public String getEpocaDeNascimento() {
		return epocaDeNascimento;
	}

	public void setEpocaDeNascimento(String epocaDeNascimento) {
		this.epocaDeNascimento = epocaDeNascimento;
	}

	public String getLocalDeNascimento() {
		return localDeNascimento;
	}

	public void setLocalDeNascimento(String localDeNascimento) {
		this.localDeNascimento = localDeNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	abstract void InfosPessoais();
	
}
