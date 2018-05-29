package starWars;

public class Habilidade extends Coisa {
	
	private int danoBase;
	private int prioridade;
	private boolean ehForca;
	private double danoTotal;
	
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
		this.danoBase = danoBase % 51;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade % 101;
	}
	
	public double getDanoTotal() {
		return danoTotal;
	}
	
	public void setDanoTotal(double danoTotal) {
		this.danoTotal = danoTotal;
	}
	
	public void construirHabilidade(String nom, int dB, int pri, boolean forca) {
		this.nome = nom;
		this.setDanoBase(dB);
		this.setPrioridade(pri);
		this.setEhforca(forca);
	}

	public void descricao() {
		System.out.println("Essa eh a habilidade " + nome + " de "); 
		if (ehForca) System.out.print("forca");
		else System.out.print("sabre");
		System.out.print(" com dano base de " + danoBase + "e prioridade" + prioridade + '.');	
	}
}
