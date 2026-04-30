package EXERCICIOS.Ex_Estrutura_Sequencial;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = sc.nextInt();

        System.out.print("Digite os votos do primeiro candidato: ");
        int votos1 = sc.nextInt();

        System.out.print("Digite os votos do segundo candidato: ");
        int votos2 = sc.nextInt();

        // Validação básica
        if (votos1 + votos2 > totalEleitores) {
            System.out.println("Erro: a soma dos votos não pode ser maior que o total de eleitores.");
        } else {
            double perc1 = (votos1 * 100.0) / totalEleitores;
            double perc2 = (votos2 * 100.0) / totalEleitores;

            System.out.println("\nResultado:");
            System.out.println("Candidato 1: " + votos1 + " votos (" + perc1 + "%)");
            System.out.println("Candidato 2: " + votos2 + " votos (" + perc2 + "%)");
        }

        sc.close();
    }
}