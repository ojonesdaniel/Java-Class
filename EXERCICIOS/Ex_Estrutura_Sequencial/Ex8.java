/*
8. Leia um número e imprima a tabuada desse número:
*/

package EXERCICIOS.Ex_Estrutura_Sequencial;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            int res = num * i;
            System.out.println(num + " x " + i + " = " + res);
        }
    }
}
