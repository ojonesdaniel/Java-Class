/* 
15. Jogo da velha Crie um programa que: 
● represente um tabuleiro usando matriz 
● permita inserir jogadas 
● exiba o tabuleiro após cada jogada ● verifique vencedor 
*/

package EXERCICIOS.Ex_Matrizes.Ex_Douglas_Matriz;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] mat = new String[3][3];

        int x, y;
        String jogador = "X";
        boolean vencedor = false;

        // Inicializa tabuleiro
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = "-";
            }
        }

        // Máximo de 9 jogadas
        for (int jogada = 0; jogada < 9; jogada++) {

            System.out.println("\nJogador: " + jogador);

            System.out.print("Digite a linha (0 a 2): ");
            x = sc.nextInt();

            System.out.print("Digite a coluna (0 a 2): ");
            y = sc.nextInt();

            // Verifica posição ocupada
            if (!mat[x][y].equals("-")) {
                System.out.println("Posição já preenchida!");
                jogada--;
                continue;
            }

            // Faz jogada
            mat[x][y] = jogador;

            // Exibe tabuleiro
            System.out.println("\nTabuleiro:");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }

            // Verifica vencedor
            for (int i = 0; i < 3; i++) {

                // Linhas
                if (mat[i][0].equals(jogador) &&
                    mat[i][1].equals(jogador) &&
                    mat[i][2].equals(jogador)) {

                    vencedor = true;
                }

                // Colunas
                if (mat[0][i].equals(jogador) &&
                    mat[1][i].equals(jogador) &&
                    mat[2][i].equals(jogador)) {

                    vencedor = true;
                }
            }

            // Diagonal principal
            if (mat[0][0].equals(jogador) &&
                mat[1][1].equals(jogador) &&
                mat[2][2].equals(jogador)) {

                vencedor = true;
            }

            // Diagonal secundária
            if (mat[0][2].equals(jogador) &&
                mat[1][1].equals(jogador) &&
                mat[2][0].equals(jogador)) {

                vencedor = true;
            }

            // Resultado
            if (vencedor) {
                System.out.println("\nJogador " + jogador + " venceu!");
                break;
            }

            // Troca jogador
            if (jogador.equals("X")) {
                jogador = "O";
            } else {
                jogador = "X";
            }

            // Empate
            if (jogada == 8) {
                System.out.println("\nEMPATE!");
            }
        }

        sc.close();
    }
}