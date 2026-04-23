package EXERCICIOS.Ex_Estrutura_Condiconal;

/*
5. Faça um programa que leia o sexo e a altura (H - em metros) de uma pessoa, calcule e apresente seu peso ideal utilizando as seguintes fórmulas: 
Peso ideal (homens) = (72,7 * H) – 58. 
Peso ideal (mulheres) = (62,1 * H) – 44,7
Sugestão: para identificar o sexo da pessoa, solicite ao usuário que informe 1 para homens, e 2 para mulheres
*/

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu sexo (M ou F):");
        String sexo = sc.nextLine();

        System.out.println("Digite a sua altura:");
        double altura = sc.nextDouble();
    
        if((sexo.equals("F"))){
            double peso_ideal = (altura * 62.1) - 44.7;
            System.out.println("Seu peso ideal é: "+ peso_ideal);
        }
        else{
            double peso_ideal = (altura * 72.7) - 58;
            System.out.println("Seu peso ideal é: "+ peso_ideal);
        }
    }
}