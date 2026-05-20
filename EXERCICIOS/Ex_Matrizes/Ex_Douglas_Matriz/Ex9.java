/*
9. Quantidade de números pares
Leia uma matriz 4x4 e informe quantos números pares existem.
*/

package EXERCICIOS.Ex_Matrizes.Ex_Douglas_Matriz;

import java.util.Scanner;

public class Ex9 {
   public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int mat[][] = new int[4][4];
        int contador = 0;

        for(int i = 0; i < 4; i++){

            for(int j = 0; j < 4; j++){
                System.out.println("Digite o valor da posição [" + i + "], [" + j + "].");        
                mat[i][j] = sc.nextInt();

                if(mat[i][j] % 2 == 0){
                    contador += 1;
                }
            }
        }
        System.out.println("A quantidade de valores pares é: " + contador);
        }    
    }

