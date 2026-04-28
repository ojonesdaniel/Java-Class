/*
5. Faça um programa que receba uma temperatura em Celsius e converta para Fahrenheit.  
   Fórmula: `F = (C * 1,8) + 32`
*/

package EXERCICIOS.Ex_Estrutura_Sequencial;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Cº: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é " + fahrenheit);
    
    }
}
