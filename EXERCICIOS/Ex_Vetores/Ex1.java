package EXERCICIOS.Ex_Vetores;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];

        // Leitura do primeiro valor
        System.out.println("Digite um valor:");
        valores[0] = sc.nextInt();

        int maior_valor = valores[0];
        int segundo_maior = Integer.MIN_VALUE;

        for (int i = 1; i < valores.length; i++) {
            System.out.println("Digite um valor:");
            valores[i] = sc.nextInt();

            if (valores[i] > maior_valor) {
                segundo_maior = maior_valor;
                maior_valor = valores[i];
            } else if (valores[i] > segundo_maior && valores[i] != maior_valor) {
                segundo_maior = valores[i];
            }
        }

        System.out.println("O maior valor é: " + maior_valor);
        System.out.println("O 2º maior valor é: " + segundo_maior);
    }
}