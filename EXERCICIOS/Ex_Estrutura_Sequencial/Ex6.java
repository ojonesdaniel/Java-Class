/*
6. Faça um programa que solicite ao usuário os coeficientes `a`, `b` e `c` de uma equação de segundo grau e imprima as raízes (considere sempre raízes reais).
*/

package EXERCICIOS.Ex_Estrutura_Sequencial;

import java.util.Scanner;

import javafx.css.SimpleStyleableStringProperty;

public class Ex6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        double a = sc.nextDouble();

        System.out.println("Digite o valor de B:");
        double b = sc.nextDouble();

        System.out.println("Digite o valor de C:");
        double c = sc.nextDouble();

        double delta = (b * b) - 4 * a * c;

        double x = (- b +(delta) ) / 2 * a;

        System.out.println("O valor de x é:" + x);
    }
}
