/*
10. Faça um programa que leia o um número inteiro entre 1 e 7 e escreva o dia da semana correspondente. 
Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe dia da semana com esse número.
*/

package EXERCICIOS.Ex_Estrutura_Condiconal;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do dia da semana:");
        int dia_semana = sc.nextInt();

        if(dia_semana == 1){
            System.out.println("Domingo");
        }
        else if(dia_semana == 2){
            System.out.println("Segunda");
        }
        else if(dia_semana == 3){
            System.out.println("Terça");
        }
        else if(dia_semana == 4){
            System.out.println("Quarta");
        }
        else if(dia_semana == 5){
            System.out.println("Quinta");
        }
        else if(dia_semana == 6){
            System.out.println("Sexta");
        }
        else if(dia_semana == 7){
            System.out.println("Sábado");
        }
        else {
            System.out.println("Número inválido");
        }
    }
}
