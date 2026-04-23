/*
9. Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral: 
- não eleitor (abaixo de 16 anos); 
- eleitor obrigatório (entre a faixa de 18 e menor de 65 anos); 
- eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive)
*/


package EXERCICIOS.Ex_Estrutura_Condiconal;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        if(idade < 16){
            System.out.println("Não eleitor.");
        }
        else if(idade < 18 || idade > 65){
            System.out.println("Eleitor facultativo.");
        }
        else{
            System.out.println("Eleitor obrigatório.");
        }
    }
}
