package starWars;

public class Habilidade extends Coisa {
	
	int danoBase;
	int prioridade;
	boolean ehForca;
	
	public int getDanoBase() {
		return danoBase;
	}

	public void setDanoBase(int danoBase) {
		this.danoBase = danoBase;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public boolean isEhforca() {
		return ehForca;
	}

	public void setEhforca(boolean ehForca) {
		this.ehForca = ehForca;
	}

	public void descricao() {
		System.out.println("Essa eh a habilidade " + nome + " de "); 
		if (ehForca) System.out.print("forca");
		else System.out.print("sabre");
		System.out.print(" com dano base de " + danoBase + "e prioridade" + prioridade + '.');	
	}



}
