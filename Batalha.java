package starWars;

import java.util.Random;

public class Batalha extends Coisa{
	
	public void descricao() {
		System.out.println("Essa é um template de batalha entre um mestre Jedi e um Lorde Sith.");
		
	}
	public static void battle (Mestre jedi, Lorde sith) {

		int vidaJedi = jedi.getPontosDeVida();
		int vidaSith = sith.getPontosDeVida();
		Habilidade[] habJedi = jedi.getHabilidades();
		Habilidade[] habSith = sith.getHabilidades();
		int numTurno = 0;
		
		System.out.println("Ola jogador. Bem vindo a batalha entre" + jedi.getNome() +  " e " + sith.getNome() + '.');
		while (vidaJedi != 0 || vidaSith != 0) {
			Random ran = new Random();
			int numHabJ = ran.nextInt(5);
			int numHabS = ran.nextInt(5);
			boolean JEsq = false;
			boolean SEsq = false;

			System.out.println("Comeca o turno" + numTurno + "! Jedi " + jedi.getNome() + " tem " + vidaJedi + " e Sith "
			+ sith.getNome() + " tem " + vidaSith + '.');
			if (numHabJ == 5) {
				System.out.println(jedi.getNome() + "esquivou!");
				JEsq = true;
			}
			if (numHabS == 5) {
				System.out.println(sith.getNome() + "esquivou!");
				SEsq = true;
			}
			if (numHabJ == 5 && numHabS == 5) {
				System.out.println("Ambos esquivaram! Ninguem atacou nesse turno!");
				break;
			}
			if (JEsq == false && SEsq == false) {
				if (habJedi[numHabJ].isEhforca() == habSith[numHabS].isEhforca()) {
					if (habJedi[numHabJ].getPrioridade() > habSith[numHabS].getPrioridade()) {
						vidaSith =- habJedi[numHabJ].getDanoTotal();
						System.out.println(jedi.getNome() + " atacou com " + habJedi[numHabJ].getNome() + "! " + sith.getNome() +
								" tomou" + habJedi[numHabJ].getDanoTotal() + "de dano.");
						if (vidaSith <= 0) break;
						vidaJedi =- habSith[numHabS].getDanoTotal();
						System.out.println(sith.getNome() + " atacou com " + habSith[numHabS].getNome() + "! " + jedi.getNome() +
								" tomou" + habSith[numHabS].getDanoTotal() + "de dano.");
						if (vidaSith <= 0) break;
						
					}
					if (habJedi[numHabJ].getPrioridade() < habSith[numHabS].getPrioridade()) {
						vidaJedi =- habSith[numHabS].getDanoTotal();
						System.out.println(sith.getNome() + " atacou com " + habSith[numHabS].getNome() + "! " + jedi.getNome() +
								" tomou" + habSith[numHabS].getDanoTotal() + "de dano.");
						if (vidaSith <= 0) break;
						vidaSith =- habJedi[numHabJ].getDanoTotal();
						System.out.println(jedi.getNome() + " atacou com " + habJedi[numHabJ].getNome() + "! " + sith.getNome() +
								" tomou" + habJedi[numHabJ].getDanoTotal() + "de dano.");
						if (vidaSith <= 0) break;
					}
					else {
						vidaJedi =- habSith[numHabS].getDanoTotal();
						vidaSith =- habJedi[numHabJ].getDanoTotal();
						System.out.println(sith.getNome() + " e "+ jedi.getNome() + " se atacaram ao mesmo tempo!") ;
						System.out.println(habSith[numHabS].getNome() + " deu "+ habSith[numHabS].getDanoTotal() + " de dano para " + 
						jedi.getNome() + ". " + habJedi[numHabJ].getNome() + " deu " + habSith[numHabS].getDanoTotal() + " dano para " + 
						jedi.getNome() + ".");
						if (vidaSith <= 0) break;
						if (vidaJedi <= 0) break;
					}
				}
				if (habJedi[numHabJ].isEhforca() != habSith[numHabS].isEhforca()) {
				
				}
			}
			numTurno++;
		}
	}
	
}
