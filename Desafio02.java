/******************************************************************************
2 - Jogo de adivinhação com dificuldade
Crie um jogo de adivinhação onde o jogador escolhe a dificuldade (fácil: 1 a 10, médio: 
1 a 50, difícil: 1 a 100). O programa gera um número aleatório(pesquisar) e o jogador
tem 5 tentativas para acertar. A cada erro, o programa dá dicas: "maior" ou "menor".
*******************************************************************************/
import java.util.Scanner;
import java.util.Random;

public class Desafio02 {
	public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    Random random = new Random();
    
    System.out.println("Escolha a dificuldade (f - fácil, m - médio, d - difícil): ");
    String dificuldade = ler.nextLine().toLowerCase();
    
    int numeroSecreto, tentativas, palpite;
    int limite = 0;
    
    if (dificuldade.equals("f")) {
      limite = 10;
    } else if (dificuldade.equals("m")) {
      limite = 50;
    } else if (dificuldade.equals("d")) {
      limite = 100;
    } else {
    System.out.println("Dificuldade inválida!");
    return;
    }

    numeroSecreto = random.nextInt(limite) + 1;
    tentativas = 5;

    System.out.println("Adivinhe o número de 1 a " + limite + ". Você tem 5 tentativas.");

    for (int i = 1; i <= tentativas; i++) {
    System.out.print("Tentativa " + i + ": ");
    palpite = ler.nextInt();

    if (palpite == numeroSecreto) {
        System.out.println("Você acertou! Parabéns!");
        return;
    } else if (palpite < numeroSecreto) {
        System.out.println("É MAIOR!");
    } else {
        System.out.println("É MENOR!");
        }
    }
        System.out.println("Acabaram as tentativas. O número era: " + numeroSecreto);
    }
}