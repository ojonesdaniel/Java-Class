/*
7. Faça um programa que receba o valor do salário mínimo e o salário de um funcionário, e calcule quantos salários mínimos ele recebe.
*/

package EXERCICIOS.Ex_Estrutura_Sequencial;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do seu sálario:");
        double salario = sc.nextDouble();
        
        System.out.println("Digite o valor do sálario minimo atual:");
        double salario_min = sc.nextDouble();
        
        double valor_sal_min = salario / salario_min;

        System.out.println("O seu sálario representa " + valor_sal_min + "em sálarios minimos.");
    }
}
