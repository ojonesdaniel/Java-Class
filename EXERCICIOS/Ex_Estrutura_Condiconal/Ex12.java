/*
12. Faça um programa que solicite ao usuário que informe dois números e que exiba o seguinte menu:
1 – Somar
2 – Subtrair 
3 – Multiplicar
4 – Dividir
5 – Sair
Em seguida, leia a opção escolhida e exiba o resultado de acordo com a opção.
*/


package EXERCICIOS.Ex_Estrutura_Condiconal;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num1 = sc.nextInt();

        System.out.println("Digite outro número:");
        int num2 = sc.nextInt();

        System.out.println("MENU:");
        System.out.println("1 - SOMAR");
        System.out.println("2 - SUBTRAIR");
        System.out.println("3 - MULTIPLICAR");
        System.out.println("4 - DIVIDIR");
        System.out.println("5 - SAIR");

        System.out.println("Digite a opção:");
        int varMenu = sc.nextInt();

        switch (varMenu) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    double resultado = (double) num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;

            case 5:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}