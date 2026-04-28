/*
4. Faça um programa que calcule e mostre a área de um losango.  
   Fórmula: `AREA = (DIAGONAL MAIOR * DIAGONAL MENOR) / 2`
*/

package EXERCICIOS.Ex_Estrutura_Sequencial;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a diagonal maior:");
        double diagonal_maior = sc.nextDouble();
        System.out.println("Digite a diagonal menor:");
        double diagonal_menor = sc.nextDouble();
    
        double area = (diagonal_maior * diagonal_menor) * 2;

        System.out.println("O valor da área do losango é: " + area + "m².");
    }
}
