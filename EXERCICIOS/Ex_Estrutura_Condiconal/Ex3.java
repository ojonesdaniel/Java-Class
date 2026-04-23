package EXERCICIOS.Ex_Estrutura_Condiconal;

/*
3. Faça um programa que receba 3 notas de um aluno, calcule e mostre uma mensagem de acordo com sua média:
 */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        int nota_1 = sc.nextInt();
        System.out.println("Digite a segunda nota:");
        int nota_2 = sc.nextInt();
        System.out.println("Digite a terceira nota:");
        int nota_3 = sc.nextInt();

        int media = (nota_1 + nota_2 + nota_3) / 3;
        
        if(media >= 7){
            System.out.println("A média esta boa!");
        }
        else {
            System.out.println("A média esta ruim, melhore.");
        }
    }
}