package starWars;

import java.util.Random;

public abstract class Batalha extends Coisa{
	
	public void descricao() {
		System.out.println("Essa eh um template de batalha entre um mestre Jedi e um Lorde Sith.");
		
	}
	public static void battle (Mestre jedi, Lorde sith) {

		double vidaJedi = jedi.getPontosDeVida();		//Comeca-se a batalha criando uma quantidade de vida que pode diminuir para cada combatente
		double vidaSith = sith.getPontosDeVida();
		Habilidade[] habJedi = jedi.getHabilidades();
		Habilidade[] habSith = sith.getHabilidades();
		int numTurno = 1;
		boolean jMorreu = false;
		boolean sMorreu = false;
		
		System.out.println("Ola jogador. Bem vindo a batalha entre " + jedi.getNome() +  " e " + sith.getNome() + '.');
		while (true) {
			Random ran = new Random();
			int numHabJ = ran.nextInt(5);	//A cada rodada, sera escolhidos dois numeros aleatorios de 0 a 4, e com eles sera decidido o que cada combatente fara
			int numHabS = ran.nextInt(5);	//Caso o numero seja de 0 a 3, a habilidade dessa posicao no vetor sera utilizada. Caso o numero seja 4, o combatente tenta se esquivar
			boolean jEsq = false;
			boolean sEsq = false;

			System.out.println("Comeca o turno " + numTurno + "! Jedi " + jedi.getNome() + " tem " + vidaJedi + " pontos de vida e Sith "
			+ sith.getNome() + " tem " + vidaSith + " pontos de vida.");
			if (numHabJ == 4) {	//Checa se o jedi tentou esquivar
				jEsq = true;
			}
			if (numHabS == 4) {	//Checa se o sith tentou esquivar
				sEsq = true;
			}
			if (numHabJ == 4 && numHabS == 4) {	//Checa se ambos esquivaram e ninguem ataca nesse turno
				System.out.println("Ambos esquivaram! Ninguem atacou nesse turno!");
				break;
			}
			if (jEsq == false && sEsq == false) {		//Checa se algum combatente esquivou
				if (habJedi[numHabJ].isEhforca() == habSith[numHabS].isEhforca()) {	//Checa se as duas habilidades sao de tipos igual (forca ou sabre)
					if (habJedi[numHabJ].getPrioridade() > habSith[numHabS].getPrioridade()) {	//Se ambas as habilidades forem do mesmo tipo, checa-se a prioridade da propria habilidade para determinar quem vai primeiro
						vidaSith -= habJedi[numHabJ].getDanoTotal();				//Nesse caso, o jedi vai primeiro porque sua habilidade era do mesmo tipo que a do sith e ela tinha prioridade maior
						System.out.println(jedi.getNome() + " atacou 1 com " + habJedi[numHabJ].getNome() + "! " + sith.getNome() +
								" tomou " + habJedi[numHabJ].getDanoTotal() + " de dano.");
						if (vidaSith <= 0) {
							sMorreu = true;
							break;
						}
						vidaJedi -= habSith[numHabS].getDanoTotal();				//Se o sith nao morrer no primeiro ataque, ele pode atacar o jedi nesse turno tambem
						System.out.println(sith.getNome() + " atacou 2 com " + habSith[numHabS].getNome() + "! " + jedi.getNome() +
								" tomou " + habSith[numHabS].getDanoTotal() + " de dano.");
						if (vidaJedi <= 0) {
							jMorreu = true;
							break;
						}
						
					}
					else if (habJedi[numHabJ].getPrioridade() < habSith[numHabS].getPrioridade()) {	//Nesse caso, o sith vai primeiro porque sua habilidade era do mesmo tipo que a do jedi e ela tinha prioridade maior
						vidaJedi -= habSith[numHabS].getDanoTotal();
						System.out.println(sith.getNome() + " atacou 3 com " + habSith[numHabS].getNome() + "! " + jedi.getNome() +
								" tomou " + habSith[numHabS].getDanoTotal() + " de dano.");
						if (vidaJedi <= 0) {
							jMorreu = true;
							break;
						}
						vidaSith -= habJedi[numHabJ].getDanoTotal();				//Se o jedi nao morrer no primeiro ataque, ele pode atacar o sith nesse turno tambem
						System.out.println(jedi.getNome() + " atacou 4 com " + habJedi[numHabJ].getNome() + "! " + sith.getNome() +
								" tomou " + habJedi[numHabJ].getDanoTotal() + " de dano.");
						if (vidaSith <= 0) {
							sMorreu = true;
							break;
						}
					}
					else {	//Nesse caso, o tipo e a prioridade de ambas as habilidades usadas sao iguais. Apenas nesse caso, ambos os combatentes atacam ao mesmo tempo e podem terminar a batalha em um empate
						vidaJedi -= habSith[numHabS].getDanoTotal();
						vidaSith -= habJedi[numHabJ].getDanoTotal();
						System.out.println(sith.getNome() + " e "+ jedi.getNome() + " se atacaram ao mesmo tempo!") ;
						System.out.println(habSith[numHabS].getNome() + " deu "+ habSith[numHabS].getDanoTotal() + " de dano para " + 
						jedi.getNome() + ". " + habJedi[numHabJ].getNome() + " deu " + habJedi[numHabJ].getDanoTotal() + " dano para " + 
						sith.getNome() + ".");
						if (vidaSith <= 0) sMorreu = true;
						if (vidaJedi <= 0) jMorreu = true;
						if (sMorreu || jMorreu) break;
					}
				}
				if (habJedi[numHabJ].isEhforca() != habSith[numHabS].isEhforca()) {	//Checa se as duas habilidades sao de tipos diferentes (forca ou sabre)
					if (habJedi[numHabJ].isEhforca()) {		//Nesse caso, o jedi ataca primeiro porque sua habilidade era do tipo forca enquanto a do sith era do tipo sabre
						vidaSith -= habJedi[numHabJ].getDanoTotal();
						System.out.println(jedi.getNome() + " atacou 5 com " + habJedi[numHabJ].getNome() + "! " + sith.getNome() +
								" tomou " + habJedi[numHabJ].getDanoTotal() + " de dano.");
						if (vidaSith <= 0) {
							sMorreu = true;
							break;
						}
						vidaJedi -= habSith[numHabS].getDanoTotal();	//Se o sith nao morrer no primeiro ataque, ele pode atacar o jedi nesse turno tambem
						System.out.println(sith.getNome() + " atacou 6 com " + habSith[numHabS].getNome() + "! " + jedi.getNome() +
								" tomou " + habSith[numHabS].getDanoTotal() + " de dano.");
						if (vidaJedi <= 0) {
							jMorreu = true;
							break;
						}
						
					}
					else {								//Nesse caso, o sith ataca primeiro porque sua habilidade era do tipo forca enquanto a do jedi era do tipo sabre
						vidaJedi -= habSith[numHabS].getDanoTotal();
						System.out.println(sith.getNome() + " atacou 7 com " + habSith[numHabS].getNome() + "! " + jedi.getNome() +
								" tomou " + habSith[numHabS].getDanoTotal() + " de dano.");
						if (vidaJedi <= 0) {
							jMorreu = true;
							break;
						}
						vidaSith -= habJedi[numHabJ].getDanoTotal();		//Se o jedi nao morrer no primeiro ataque, ele pode atacar o sith nesse turno tambem
						System.out.println(jedi.getNome() + " atacou 8 com " + habJedi[numHabJ].getNome() + "! " + sith.getNome() +
								" tomou " + habJedi[numHabJ].getDanoTotal() + " de dano.");
						if (vidaSith <= 0) {
							sMorreu = true;
							break;
						}
					}
				}
			}
			else {		//Aqui leva em conta se algum dos combatentes esquivou
				if (sEsq == true) {		//Caso o sith que tenha se esquivado
					if (habJedi[numHabJ].isEhforca()) {
						vidaSith -= habJedi[numHabJ].getDanoTotal();
						System.out.println(sith.getNome() + " tentou se esquivar... mas foi impossivel! ");		//O combatente nao consegue esquivar de uma habilidade tipo forca...
						System.out.println(jedi.getNome() + " atacou 9 com " + habJedi[numHabJ].getNome() + "! " + sith.getNome() +
								" tomou " + habJedi[numHabJ].getDanoTotal() + " de dano.");
						if (vidaSith <= 0 ) {
							sMorreu = true;
							break;
						}
					}
					else {
						System.out.println(sith.getNome() + " se esquivou de " + habJedi[numHabJ].getNome() + " de " + jedi.getNome() + " e nao tomou nenhum dano!");		//... mas consegue se esquivar de uma tipo sabre
					}
				}
				if (jEsq == true) {		//Caso o jedi que tenha se esquivado
					if (habSith[numHabS].isEhforca()) {
						vidaJedi -= habSith[numHabS].getDanoTotal();
						System.out.println(jedi.getNome() + " tentou se esquivar... mas foi impossivel! ");
						System.out.println(sith.getNome() + " atacou 10 com " + habSith[numHabS].getNome() + "! " + jedi.getNome() +
								" tomou " + habSith[numHabS].getDanoTotal() + " de dano.");
						if (vidaJedi <= 0) {
							jMorreu = true;
							break;
						}
					}
					else {
						System.out.println(jedi.getNome() + " se esquivou de " + habSith[numHabS].getNome() + " de " + sith.getNome() + " e nao tomou nenhum dano!");
					}
				}
			}
			numTurno++;
		}
		if (jMorreu && sMorreu) {		//Aqui ve se quem foi que venceu a batalha. Pode ter sido o Jedi, pode ter sido o Sith, ou podenao ter sido ninguem se for um nocaute duplo
			System.out.println ("A batalha acabou! Foi um empate! Tanto jedi " + jedi.getNome() + " quanto sith " + sith.getNome() + " estao nocauteados.");
		}
		if (jMorreu) {
			System.out.println("A batalha acabou! " + sith.getNome() + " venceu " + jedi.getNome() + " com " + vidaSith + " pontos de vida! Essa batalha durou " + numTurno + " turno(s).");
		}
		if (sMorreu) {
			System.out.println("A batalha acabou! " + jedi.getNome() + " venceu " + sith.getNome() + " com " + vidaJedi + " pontos de vida! Essa batalha durou " + numTurno + " turno(s).");
		}
	}
	
}
