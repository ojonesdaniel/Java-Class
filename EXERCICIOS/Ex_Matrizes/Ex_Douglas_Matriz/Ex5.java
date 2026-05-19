/*
5. Soma de cada coluna
Leia uma matriz 4x4 e exiba a soma de cada coluna.
*/

package EXERCICIOS.Ex_Matrizes.Ex_Douglas_Matriz;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int mat[][] = new int[4][4];
        int vetor_soma[] = new int[4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Digite o valor da posição [" + i + "], [" + j + "].");     
                mat[i][j] = sc.nextInt();
                vetor_soma[j] += mat[i][j];
            }
        }
        for(int j = 0; j < 4; j++){
                System.out.println("Soma da coluna [" + j + "]: " + vetor_soma[j]);        
        }
    }
}    
