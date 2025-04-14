/******************************************************************************
3 - Cadastro de notas com classificação
O programa deve permitir o cadastro de várias notas (entre 0 e 10). A cada nota 
inserida, o sistema deve classificar como:

Excelente (>= 9)
Bom (>= 7)
Regular (>= 5)
Insuficiente (< 5)
*Quando o usuário digitar -1, o programa termina e exibe a média geral e a 
contagem de cada classificação.
*******************************************************************************/
import java.util.Scanner; 

public class Desafio03 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    int nota, contagemDeNotas = 0; 
    double somaDasNotas = 0;
    int excelente = 0;
    int bom = 0;
    int regular = 0;
    int insuficiente = 0;
 
    while (true) {
        System.out.println("Entre com um número de 0 a 10, ou digite -1 para sair: ");
        nota = ler.nextInt();
    if (nota == -1) {
        break; 
        }

    if (nota >= 0 && nota <= 10) {
        somaDasNotas += nota;
        contagemDeNotas++;

    if (nota >= 9) {
        excelente++;
        System.out.println("Sua nota está excelente!");
    } else if (nota >= 7) {
        bom++;
        System.out.println("Você teve uma nota boa!");
    } else if (nota >= 5) {
        regular++;
        System.out.println("Sua nota é regular.");
    } else {
        insuficiente++;
        System.out.println("Infelizmente, sua nota foi insuficiente.");
    }
    } else {
        System.out.println("Nota inválida! Por favor, digite uma nota entre 0 e 10.");
        }
    }

        if (contagemDeNotas > 0) {
            double media = somaDasNotas / contagemDeNotas;
            System.out.println("\nMédia geral: " + media);
            System.out.println("Contagem de notas excelente: " + excelente);
            System.out.println("Contagem de notas boa: " + bom);
            System.out.println("Contagem de notas regular: " + regular);
            System.out.println("Contagem de notas insuficiente: " + insuficiente);
        } else {
            System.out.println("\nNenhuma nota foi registrada.");
        }
    }
}
