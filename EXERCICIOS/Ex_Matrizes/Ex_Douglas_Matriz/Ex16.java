/*
16. Busca em matriz
Leia uma matriz 6x6 e um número X.
Informe:
● se X existe na matriz
*/

package EXERCICIOS.Ex_Matrizes.Ex_Douglas_Matriz;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[6][6];
        int x;
        boolean encontrado = false;

        // Leitura da matriz
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                System.out.println("Digite o valor da posição [" + i + "][" + j + "]:");
                mat[i][j] = sc.nextInt();
            }
        }

        // Número a buscar
        System.out.println("Digite o número que deseja procurar:");
        x = sc.nextInt();

        // Busca
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                if (mat[i][j] == x) {
                    encontrado = true;

                    System.out.println("Número encontrado na posição [" + i + "][" + j + "]");
                }
            }
        }

        // Resultado final
        if (encontrado) {
            System.out.println("O número existe na matriz.");
        } else {
            System.out.println("O número NÃO existe na matriz.");
        }

        sc.close();
    }
}