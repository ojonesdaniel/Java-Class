/*
3. Contar Frequência de um Número
Enunciado:
Leia um vetor e um número X. Conte quantas vezes X aparece no vetor.
*/

package EXERCICIOS.Ex_Vetores;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor escolhido:");
        int valor_escolhido = sc.nextInt();

        int contador = 0;
        int[] valores = new int[10];

        for(int i = 0; i < valores.length; i++){
            
            System.out.println("Digite o valor para o vetor:");
            valores[i] = sc.nextInt();

            if(valor_escolhido == valores[i]){
                contador = contador + 1;
            }
        }

        System.out.println("o Valor escolhido repete " + contador + " vezes dentro do vetor");
    }
}
