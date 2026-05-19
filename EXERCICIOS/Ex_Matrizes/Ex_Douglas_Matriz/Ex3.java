/*
3. Maior elemento da matriz
Leia uma matriz 5x5 e informe:
● o maior valor
● a linha e coluna onde ele aparece
*/

package EXERCICIOS.Ex_Matrizes.Ex_Douglas_Matriz;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mat[][] = new int[5][5];
        int indice_i = 0;
        int indice_j = 0;

        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 5; j++){
                System.out.println("Digite o valor da posição [" + i + "], [" + j + "].");        
                mat[i][j] = sc.nextInt();

                if(mat[i][j] > mat[indice_i][indice_j]){
                    indice_i = i;
                    indice_j = j;                 
                }
            }
        }
        
        System.out.println("O maior valor é: " + mat[indice_i][indice_j]);
        System.out.println("Sua posição é [" + indice_i + "], [" + indice_j + "].");        
    }
}      
