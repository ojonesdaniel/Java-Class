/*
1. Exibir uma matriz
Leia uma matriz 3x3 de números inteiros e exiba-a no formato matricial.
Exemplo
Entrada:
1 2 3
4 5 6
7 8 9
Saída:
1 2 3
4 5 6
7 8 9
*/

package EXERCICIOS.Ex_Matrizes.Ex_Douglas_Matriz;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);


        int mat[][] = new int[3][3];


        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){
                System.out.println("Digite o valor da posição [" + i + "], [" + j + "].");        
                mat[i][j] = sc.nextInt();
            }
        }
        // Exibição da matriz
        for(int i = 0; i < 3; i++) {

            for(int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }

            System.out.println();
        }    
    }
}
