/******************************************************************************
Desafio06-  Faça um programa em Java para resolver a equação de 2º grau.        
    Pedir para o usuário entrar com as variáveis A, B e C .
    Mostrar o valor de x1, x2 e delta.
 *******************************************************************************/
import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double A, B, C, delta, x1, x2;
        
        System.out.print("Digite o valor de A: ");
        A = ler.nextDouble();
       
        System.out.print("Digite o valor de B: ");
        B = ler.nextDouble();
       
        System.out.print("Digite o valor de C: ");
        C = ler.nextDouble();
       
        delta = (B * B) - (4 * A * C);

        if (delta > 0) {
        x1 = (-B + Math.sqrt(delta)) / (2 * A);
        x2 = (-B - Math.sqrt(delta)) / (2 * A);
        System.out.println("Delta = " + delta);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        } else if (delta == 0) {
           
        x1 = -B / (2 * A);
        System.out.println("Delta = " + delta);
        System.out.println("x1 = x2 = " + x1);
        } else {
            System.out.println("Delta = " + delta);
            System.out.println("A equação não possui raízes reais.");
        }
    }
}