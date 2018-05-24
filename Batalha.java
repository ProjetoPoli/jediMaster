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
			boolean esquivou = false;

			System.out.println("Comeca o turno" + numTurno + "! Jedi " + jedi.getNome() + " tem " + vidaJedi + " e Sith "
			+ sith.getNome() + " tem " + vidaSith + '.');
			if (numHabJ == 5) {
				System.out.println(jedi.getNome() + "esquivou!");
				esquivou = true;
			}
			if (numHabS == 5) {
				System.out.println(sith.getNome() + "esquivou!");
				esquivou = true;
			}
			if (numHabJ == 5 && numHabS == 5) {
				System.out.println("Ambos esquivaram! Ninguem atacou nesse turno!");
				break;
			}
			if (esquivou != false) {
				if (habJedi[numHabJ].ehForca && !habSith[numHabS].ehForca) {
					
				}
				if (!habJedi[numHabJ].ehForca && habSith[numHabS].ehForca) {
				
				}
			}
			numTurno++;
		}
	}
	
}
