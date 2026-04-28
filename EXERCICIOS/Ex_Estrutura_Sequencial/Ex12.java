/*
12. Faça um programa que calcule o peso ideal de um homem.  
 Fórmula: `P = (72,7 * H) – 58`
*/

package EXERCICIOS.Ex_Estrutura_Sequencial;

import java.util.Scanner;;

public class Ex12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();

        double peso = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal é: " + peso);
    
    }
}
