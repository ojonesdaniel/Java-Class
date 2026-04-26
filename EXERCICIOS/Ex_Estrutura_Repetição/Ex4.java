/*
4. Faça um programa que leia um número e que imprima os números ímpares de 1 até o número informado. 
*/

package EXERCICIOS.Ex_Estrutura_Repetição;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num_escolhido = sc.nextInt();

        for(int num_imprimir = 0; num_imprimir <= num_escolhido; num_imprimir++){
            if(num_imprimir % 2 != 0){
                System.out.println(num_imprimir);
            }
        }
    }
}
