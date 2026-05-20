/*
10. Multiplicação por um número
Leia:
● uma matriz 3x3
● um número inteiro X
Multiplique todos os elementos da matriz por X e mostre a nova matriz.
*/

package EXERCICIOS.Ex_Matrizes.Ex_Douglas_Matriz;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int mat[][] = new int[3][3];

        System.out.println("Digite um valor para multiplicar:");
        int multiplicador = sc.nextInt();

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){
                System.out.println("Digite o valor da posição [" + i + "], [" + j + "].");        
                mat[i][j] = sc.nextInt();

                mat[i][j] = multiplicador * mat[i][j];
            }
        }
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
        System.out.println();    
        }   
    }
}