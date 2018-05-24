package starWars;

public class Planeta extends Local {
	
	private float diametroKm;
	private String cor;
	
	public float getDiametroKm() {
		return diametroKm;
	}

	public void setDiametroKm(float diametroKm) {
		this.diametroKm = diametroKm;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
		
	public void descricao() {
		System.out.println("Esse eh o planeta " + nome + ", de cor " + cor + "e diametro " + diametroKm + '.');
	}

}
