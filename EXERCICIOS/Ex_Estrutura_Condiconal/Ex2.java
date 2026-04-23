package EXERCICIOS.Ex_Estrutura_Condiconal;

/*
2. Faça um programa que receba as duas notas de um aluno, calcule sua média, e que imprima a sua situação: 
>= 7 -> Aprovado
< 7 -> Reprovado 
*/

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a nota de matématica:");
        int nota_mat = sc.nextInt();
        
        System.out.println("Digite a nota de português:");
        int nota_por = sc.nextInt();

        int media = (nota_mat + nota_por) / 2;
        System.out.println("A média de suas notas é " + media);

        if(nota_mat >= 7){
            System.out.println("Aprovado em matématica!");
        }
        else{
            System.out.println("Reprovado.");
        }
        
        if(nota_por >= 7){
            System.out.println("Aprovado em português!");
        }
        else{
            System.out.println("Reprovado.");
        }
    }
}

