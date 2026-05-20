/*
7. Soma da diagonal principal
Leia uma matriz quadrada e calcule a soma da diagonal principal.
*/

package EXERCICIOS.Ex_Matrizes.Ex_Douglas_Matriz;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int mat[][] = new int[5][5];
        int somador = 0;

        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 5; j++){
                System.out.println("Digite o valor da posição [" + i + "], [" + j + "].");        
                mat[i][j] = sc.nextInt();

                if(i == j){
                    somador += mat[i][j];
                }
            }
        }
            System.out.println("O valor da soma das posições é: " + somador);
        }    
    }
  
