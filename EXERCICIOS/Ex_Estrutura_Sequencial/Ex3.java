/*
3. Faça um programa que receba a cotação do dólar em reais e um valor em dólares. Imprima este valor em reais.
*/

package EXERCICIOS.Ex_Estrutura_Sequencial;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cotação do dolar:");
        double cot_dolar = sc.nextDouble();

        System.out.println("Digite um valor em dolar:");
        double valor_dolar = sc.nextDouble();        
    
        double valor_real = cot_dolar * valor_dolar;;

        System.out.println("O valor em reais é: R$" + valor_real);
    }
}
