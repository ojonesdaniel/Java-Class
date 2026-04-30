/*
1. Segundo Maior Elemento
Enunciado:
Faça um programa que receba um vetor de números inteiros e encontre o segundo maior
elemento.
*/
package EXERCICIOS.Ex_Vetores;

import java.util.Scanner;

public class Ex1{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];
        int maior_valor;
        int segundo_maior;

        System.out.println("Digite um valor:");
        valores[0] = sc.nextInt();

        for(int i = 1; i < valores.length; i++){
            System.out.println("Digite um valor:");
            valores[i] = sc.nextInt();

            if(maior_valor < valores[i]){
                maior_valor = valores[i];
            }
            else if(maior_valor > valores[i]){
                segundo_maior = valores[i];
            }
            else if(maior_valor > valores[i] && segundo_maior <= valores[i]){
                segundo_maior = valores[i];
            }

            System.out.println("O maior valor é: " + maior_valor); 
            System.out.println("O 2º maior valor é: " + segundo_maior); 
        }
            /*if(maior_valor > segundo_maior){
                System.out.println("O maior valor é: " + maior_valor); 
                System.out.println("O 2º maior valor é: " + segundo_maior); 
            }
            else{
                System.out.println("Valores inválidos");
            } */
            
    }
}
