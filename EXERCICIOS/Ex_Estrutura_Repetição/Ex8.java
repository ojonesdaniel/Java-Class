/*
8. Faça um programa que leia a idade e peso de sete pessoas. Calcule e mostre:
	- a quantidade de pessoas com mais de 90 kg
	- a média das idades das sete pessoas
*/

package EXERCICIOS.Ex_Estrutura_Repetição;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int idade;
        double peso;

        int contador_peso = 0;
        int soma_idade = 0;
        double media_idade;

        for(int i = 0; i < 7; i++){
            System.out.println("Digite a idade:");
            idade = sc.nextInt();
            soma_idade = soma_idade + idade;
            


            System.out.println("Digite o peso:");
            peso = sc.nextDouble();
            if(peso > 90){
                contador_peso++;
            }            
        }
        
        media_idade = soma_idade / 7;
        System.out.println("A média das idades digitas é de: " + media_idade);
        System.out.println("A quantidade de pessoas com mais de 90Kg é de: " + contador_peso);


    }
}
