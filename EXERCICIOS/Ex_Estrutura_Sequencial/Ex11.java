/*
11. Faça um programa que receba um número inteiro e imprima:
- O antecessor
- O sucessor
- O dobro
- A metade
*/

package EXERCICIOS.Ex_Estrutura_Sequencial;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = sc.nextInt();

        if( num >= 0){
            System.out.println("O antecessor: " + (num - 1));
            System.out.println("O sucessor: " + (num + 1));
            System.out.println("O dobro: " + (num * 2));
            System.out.println("A metade: " + (num * 2));
        }
        else{
            System.out.println("Valor inválido...");
        }    }
}
