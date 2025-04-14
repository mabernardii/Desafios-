/******************************************************************************
4 - Caixa eletrônico com cédulas disponíveis
Simule um caixa eletrônico. O usuário informa o valor do saque, e o programa 
informa quantas cédulas de R$100, R$50, R$20, R$10 e R$5 serão entregues, com base
nas cédulas disponíveis. Caso não seja possível realizar o saque com as cédulas, 
exiba uma mensagem de erro.
*******************************************************************************/
 import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int CedulaDe100 = 10;
    int CedulaDe50 = 10;  
    int CedulaDe20 = 10;  
    int CedulaDe10 = 10;
    int CedulaDe5 = 10;  
    
    System.out.print("Digite o valor do saque: R$ ");
    int valorSaque = scanner.nextInt();
    
    if (valorSaque % 5 != 0) {
        System.out.println("Erro: O valor do saque deve ser múltiplo de 5.");
        return;
        }
    
    int qntd100 = 0, qntd50 = 0, qntd20 = 0, qntd10 = 0, qntd5 = 0;

    while (valorSaque > 0) {
    if (valorSaque >= 100 && CedulaDe100 > 0) {
        qntd100 = valorSaque / 100;
    if (qntd100 > CedulaDe100) {
        qntd100 = CedulaDe100;
        }
        valorSaque -= qntd100 * 100;
        CedulaDe100 -= qntd100;
    } else if (valorSaque >= 50 && CedulaDe50 > 0) {
        qntd50 = valorSaque / 50;
    if (qntd50 > CedulaDe50) {
        qntd50 = CedulaDe50;
        }
        valorSaque -= qntd50 * 50;
        CedulaDe50 -= qntd50;
    } else if (valorSaque >= 20 && CedulaDe20 > 0) {
        qntd20 = valorSaque / 20;
    if (qntd20 > CedulaDe20) {
        qntd20 = CedulaDe20;
        }
        valorSaque -= qntd20 * 20;
        CedulaDe20 -= qntd20;
    } else if (valorSaque >= 10 && CedulaDe10 > 0) {
        qntd10 = valorSaque / 10;
    if (qntd10 > CedulaDe10) {
        qntd10 = CedulaDe10;
        }
        valorSaque -= qntd10 * 10;
        CedulaDe10 -= qntd10;
    } else if (valorSaque >= 5 && CedulaDe5 > 0) {
        qntd5 = valorSaque / 5;
    if (qntd5 > CedulaDe5) {
        qntd5 = CedulaDe5;
        }
        valorSaque -= qntd5 * 5;
        CedulaDe5 -= qntd5;
    } else {
        break;
        }
    }

    if (valorSaque > 0) {
        System.out.println("Erro: Não foi possível completar o saque com as cédulas disponíveis.");
    } else {
        System.out.println("Saque realizado com sucesso!");
        if (qntd100 > 0) System.out.println("Cédulas de R$100: " + qntd100);
        if (qntd50 > 0) System.out.println("Cédulas de R$50: " + qntd50);
        if (qntd20 > 0) System.out.println("Cédulas de R$20: " + qntd20);
        if (qntd10 > 0) System.out.println("Cédulas de R$10: " + qntd10);
        if (qntd5 > 0) System.out.println("Cédulas de R$5: " + qntd5);
        }

     
    }
}
