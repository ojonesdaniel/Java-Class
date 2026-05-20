/*
13. Multiplicação entre matrizes
Leia duas matrizes 2x2 e realize a multiplicação entre elas.
*/

package EXERCICIOS.Ex_Matrizes.Ex_Douglas_Matriz;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int mat[][] = new int[3][3];
        int mat_2[][] = new int[3][3];
        int mat_res[][] = new int[3][3];


        System.out.println("Digite um valor para multiplicar:");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Digite o valor da posição [" + i + "], [" + j + "].");        
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Digite o valor da posição [" + i + "], [" + j + "].");        
                mat_2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print( mat[i][j] * mat_2[i][j] + " ");
            }
        System.out.println();    
        }   
    }
}
