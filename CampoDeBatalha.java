package starWars;

public class CampoDeBatalha {

	public static void main(String[] args) {
		Mestre Yoda = new Mestre();
		Yoda.construirMestre("Yoda", 20000, 6, 9);
		Habilidade y1 = new Habilidade();
		y1.construirHabilidade("Levitacao", 20, 100, true);
		Habilidade y2 = new Habilidade();
		y2.construirHabilidade("Ataque Direto", 40, 38, false);
		Habilidade y3 = new Habilidade();
		y3.construirHabilidade("Defleccao com Sabre", 24, 10, false);
		Habilidade y4 = new Habilidade();
		y4.construirHabilidade("Enterrada de forca", 50, 84, true);
		Yoda.setHabilidades(y1); Yoda.setHabilidades(y2); Yoda.setHabilidades(y3); Yoda.setHabilidades(y4);
		
		Lorde Sideous = new Lorde();
		Sideous.construirMestre("Palpatine", 849, 4, 6);
		Habilidade s1 = new Habilidade();
		s1.construirHabilidade("Raios Sith", 32, 40, true);
		Habilidade s2 = new Habilidade();
		s2.construirHabilidade("Rodopio de Sabre", 30, 2, false);
		Habilidade s3 = new Habilidade();
		s3.construirHabilidade("Jedi Flambe", 44, 69, false);
		Habilidade s4 = new Habilidade();
		s4.construirHabilidade("Chacoalhada de Forca", 50, 12, true);
		Sideous.setHabilidades(s4); Sideous.setHabilidades(s3); Sideous.setHabilidades(s2); Sideous.setHabilidades(s1);
		
		Batalha.battle(Yoda, Sideous);
	}

}
