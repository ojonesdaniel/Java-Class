/*
2. Rotação de Vetor à Direita
Enunciado:
Rotacione um vetor uma posição à direita. O último elemento deve ir para a primeira
posição.
*/
package EXERCICIOS.Ex_Vetores;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];
        int[] valores_direita = new int[5];


        /// PEGANDO OS VALORES NORMAIS
        for(int i = 0; i < valores.length; i++){

            System.out.println("Digite seu valor:");
            valores[i] = sc.nextInt();
        }
        
        for(int i = 0; i < valores.length; i++){
            System.out.println("Valor no indice " + (i + 1) + ": " + valores[i]);
        }

        
        /// PASSANDO OS VALORES PARA A DIREITA
        for(int i = 0; i < valores_direita.length; i++){

            if(i == 0){
                valores_direita[i] = valores[valores.length - 1];
            }
            else{
                valores_direita[i] = valores[i - 1];
            }
        }

        for(int i = 0; i < valores.length; i++){
            System.out.println("Valor no indice " + (i + 1) + ": " + valores_direita[i]);
        }
    }
}
