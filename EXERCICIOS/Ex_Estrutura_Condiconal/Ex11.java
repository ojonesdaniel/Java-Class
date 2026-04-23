/* 
11. Faça um programa que leia um número inteiro entre 1 e 12 e escrever o mês correspondente. 
Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe mês com este número.
*/

package EXERCICIOS.Ex_Estrutura_Condiconal;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número do dia da mês:");
        int dia_semana = sc.nextInt();

        if(dia_semana == 1){
            System.out.println("Janeiro");
        }
        else if(dia_semana == 2){
            System.out.println("Fevereiro");
        }
        else if(dia_semana == 3){
            System.out.println("Março");
        }
        else if(dia_semana == 4){
            System.out.println("Abril");
        }
        else if(dia_semana == 5){
            System.out.println("Maio");
        }
        else if(dia_semana == 6){
            System.out.println("Junho");
        }
        else if(dia_semana == 7){
            System.out.println("Julho");
        }
        else if(dia_semana == 8){
            System.out.println("Agosto");
        }
        else if(dia_semana == 9){
            System.out.println("Setembro");
        }
        else if(dia_semana == 10){
            System.out.println("Outubro");
        }            
        else if(dia_semana == 11){
            System.out.println("Novembro");
        }  
        else if(dia_semana == 12){
            System.out.println("Dezembro");
        }                              
        else {
            System.out.println("Número do mês inválido");
        }
    }
}
