/*
8. Diagonal secundária
Leia uma matriz 5x5 e exiba os elementos da diagonal secundária.
Dica
linha + coluna == tamanho - 1
*/

package EXERCICIOS.Ex_Matrizes.Ex_Douglas_Matriz;

import java.util.Scanner;

public class Ex8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int mat[][] = new int[5][5];
        int somador = 0;

        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 5; j++){
                System.out.println("Digite o valor da posição [" + i + "], [" + j + "].");        
                mat[i][j] = sc.nextInt();

                if(i + j == 5 - 1){
                    somador += mat[i][j];
                }
            }
        }
            System.out.println("O valor da soma das posições é: " + somador);
        }    
    }
  
