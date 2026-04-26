/*
6. Faça um programa que leia o sexo e o peso de 10 pessoas, 
e mostre quantas pessoas do sexo masculino possuem peso entre 60 e 80 kg, 
bem como a quantidade de mulheres que possuem peso entre 50 e 70 kg.
*/

package EXERCICIOS.Ex_Estrutura_Repetição;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String sexo;
    double peso;
    int contador_m = 0;
    int contador_f = 0;

    for(int i = 0; i < 10; i++){
        System.out.println("Digite o seu sexo (M ou F): ");
        sexo = sc.nextLine();

        System.out.println("Digite o seu peso (em Kg): ");
        peso = sc.nextDouble();
        sc.nextLine(); // limpa o buffer

        if(sexo.equalsIgnoreCase("M") && peso >= 60 && peso <= 80){
            contador_m++;
        }
        else if(sexo.equalsIgnoreCase("F") && peso >= 50 && peso <= 70){
            contador_f++;
        }
    }

    System.out.println("Homens entre 60 e 80 kg: " + contador_m);
    System.out.println("Mulheres entre 50 e 70 kg: " + contador_f);
    }   
}
