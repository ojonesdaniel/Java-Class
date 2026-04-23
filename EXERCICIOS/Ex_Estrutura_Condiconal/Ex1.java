package EXERCICIOS.Ex_Estrutura_Condiconal;

/*
1. Faça um programa que receba dois números e mostre o maior e o menor. Emita uma mensagem, caso os dois sejam iguais.
*/

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num_1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int num_2 = sc.nextInt();

        if(num_1 > num_2){
            System.out.println(num_1 + " é o maior número.");
        }
        else if(num_1 < num_2){
            System.out.println(num_2 + " é o maior número.");
        }
        else{
            System.out.println("Eles são iguais.");
        }
    }
}