/*
4. Soma de cada linha
Leia uma matriz 4x4 e mostre a soma de cada linha.
Exemplo
Linha 0 = 20
Linha 1 = 15
...
*/

package EXERCICIOS.Ex_Matrizes.Ex_Douglas_Matriz;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int mat[][] = new int[4][4];
        int somador = 0;

        for(int i = 0; i < 4; i++){

            for(int j = 0; j < 4; j++){
                System.out.println("Digite o valor da posição [" + i + "], [" + j + "].");        
                mat[i][j] = sc.nextInt();

                somador = somador + mat[i][j];
            }
        System.out.println("O valor da soma é " + somador);
        }
    }
}     
