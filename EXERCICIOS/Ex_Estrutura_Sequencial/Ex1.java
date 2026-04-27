/*
1. Leia três números inteiros e imprima a média aritmética entre esses números.
 */

package EXERCICIOS.Ex_Estrutura_Sequencial;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero[] = new int[3];
        int soma_numeros = 0;


        for(int i = 0; i < 3; i++){
        System.out.println("Digite o " + (1+i) + "º número: ");
        numero[i] = sc.nextInt();

        soma_numeros = soma_numeros + numero[i];
        }

        int media_numeros = soma_numeros / 3;
        System.out.println("A média dos número  é igual a: " + media_numeros);
    }
}
