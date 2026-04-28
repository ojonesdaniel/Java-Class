/*
14. Faça um programa que leia duas variáveis e troque seus valores.  
 Exemplo:
 ```
 Entrada: A = 7, B = 9
 Saída: A = 9, B = 7
 ```
*/

package EXERCICIOS.Ex_Estrutura_Sequencial;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B:");
        int b = sc.nextInt();

        a = a - b;
        b = b + a; /// 2 + 1 - 2
        a = a - b * (-1);


        System.out.println("O valor de A: " + a);
        System.out.println("O valor de B: " + b);
    }
}
