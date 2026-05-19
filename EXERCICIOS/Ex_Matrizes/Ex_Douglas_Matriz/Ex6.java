/*
6. Diagonal principal
Leia uma matriz 5x5 e mostre apenas os elementos da diagonal principal.
Dica
Elementos onde:
linha == coluna
*/

package EXERCICIOS.Ex_Matrizes.Ex_Douglas_Matriz;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int mat[][] = new int[5][5];
        int d_prinpal[] = new int[5];

        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 5; j++){
                System.out.println("Digite o valor da posição [" + i + "], [" + j + "].");        
                mat[i][j] = sc.nextInt();

                if(i == j){
                    d_prinpal[i] = mat[i][j];
                }
            }
        }
        for(int i = 0; i < 5; i++){
            System.out.println("O valor da posição [" + i + "], [" + i + "] o valor é: " + d_prinpal[i]);
        }    
    }
}  
