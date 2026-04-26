/*
3. Faça um programa que faça a leitura de 5 valores, e para cada valor, mostre o seu dobro na tela. 
*/

package EXERCICIOS.Ex_Estrutura_Repetição;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[4];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o " + (i+1) + "º número:");
            numeros[i] = sc.nextInt();
            
            int dobro = numeros[i] * 2;
            System.out.println("Seu dobro é: " + dobro);
        }
    }
}
