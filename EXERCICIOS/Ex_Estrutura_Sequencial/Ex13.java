/*
13. Faça o mesmo para mulheres.  
 Fórmula: `P = (62,1 * H) – 44,7`
*/

package EXERCICIOS.Ex_Estrutura_Sequencial;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();

        double peso = (62.1 * altura) - 44.7;

        System.out.println("Seu peso ideal é: " + peso);
    
    }
}
