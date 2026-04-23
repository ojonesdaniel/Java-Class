package EXERCICIOS.Ex_Estrutura_Condiconal;
/*
7. Uma empresa decide dar aumento de 30% aos funcionários com salários inferiores a R$1000,00. 
Faça um programa que receba o salário do funcionário e mostre o valor do salário reajustado ou uma mensagem, caso o funcionário não tenha direito ao aumento. 
*/

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do salário:");
        double salarioBase = sc.nextDouble();

        if (salarioBase < 1000) {
            salarioBase = salarioBase * 1.3;
            System.out.printf("Salário reajustado: R$ %.2f%n", salarioBase);
        } else {
            System.out.println("Funcionário não tem direito ao aumento.");
        }
    }
}