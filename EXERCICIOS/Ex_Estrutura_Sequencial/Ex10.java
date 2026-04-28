/*
10. Um restaurante cobra 10% de gorjeta. Faça um programa que leia o valor gasto pelo cliente e informe o valor da gorjeta.
*/

package EXERCICIOS.Ex_Estrutura_Sequencial;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite o valor da conta:");
        double valor_conta = sc.nextDouble();

        double gorjeta = valor_conta * (1/10); 
        System.out.println("O valor da gorjeta é: " + gorjeta);
    }
}
