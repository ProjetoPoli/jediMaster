package starWars;

public class Habilidade extends Coisa {
	
	private int danoBase;
	private int prioridade;
	private boolean ehForca;
	private int danoTotal;
	
	public boolean isEhforca() {
		return ehForca;
	}

	public void setEhforca(boolean ehForca) {
		this.ehForca = ehForca;
	}
	
	public int getDanoBase() {
		return danoBase;
	}

	public void setDanoBase(int danoBase) {
		this.danoBase = danoBase;
		if (!ehForca) {
			danoTotal = danoBase*2;
		}
		else danoTotal = danoBase;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	public int getDanoTotal() {
		return danoTotal;
	}

	public void descricao() {
		System.out.println("Essa eh a habilidade " + nome + " de "); 
		if (ehForca) System.out.print("forca");
		else System.out.print("sabre");
		System.out.print(" com dano base de " + danoBase + "e prioridade" + prioridade + '.');	
	}
}
