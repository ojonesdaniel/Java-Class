/*
11. Transposta da matriz
Leia uma matriz 3x3 e gere sua matriz transposta.
Exemplo
1 2 3
4 5 6
7 8 9
Transposta:
1 4 7
2 5 8
3 6 9 */

package EXERCICIOS.Ex_Matrizes.Ex_Douglas_Matriz;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int mat[][] = new int[3][3];
        int mat_t[][] = new int[3][3];


        System.out.println("Digite um valor para multiplicar:");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Digite o valor da posição [" + i + "], [" + j + "].");        
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                mat_t[i][j] = mat[j][i];
            }
        }        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(mat_t[i][j] + " ");
            }
        System.out.println();    
        }   
    }
}
