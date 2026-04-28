/*
9. Receba um número positivo e calcule:
- O número ao quadrado
- O número ao cubo
- A raiz quadrada
- A raiz cúbica
*/

package EXERCICIOS.Ex_Estrutura_Sequencial;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = sc.nextInt();

        if( num >= 0){
            System.out.println("ao quadrado: " + num * num);
            System.out.println("ao cubo: " + num * num * num);
            System.out.println("raiz ao quadrado: " + num * (1/2));
            System.out.println("raiz ao cubo: " + num * (1/3));
        }
        else{
            System.out.println("Valor inválido...");
        }
    }
}
