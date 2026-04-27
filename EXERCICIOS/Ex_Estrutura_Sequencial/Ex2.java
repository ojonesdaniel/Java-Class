/*
2. Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual e imprima:
   - A idade da pessoa no ano atual
   - A idade que a pessoa terá em 2050
*/
   
package EXERCICIOS.Ex_Estrutura_Sequencial;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade_atual = sc.nextInt();

        int idade_2025 = 2050 - (2026 - idade_atual);

        System.out.println("Você tera a idade de " + idade_2025 + " anos.");
        
    }
}
