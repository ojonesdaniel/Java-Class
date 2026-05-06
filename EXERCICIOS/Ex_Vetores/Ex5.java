/*
5. Separar Pares e Ímpares
Enunciado:
Leia um vetor de inteiros e separe os números pares e ímpares em dois novos vetores.
*/

package EXERCICIOS.Ex_Vetores;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int valores[] = new int[10];
        int valores_impares[] = new int[10];
        int valores_pares[] = new int[10];


        for(int i = 0; i < 10; i++){

            System.out.println("Digite um valor:");
            valores[i] = sc.nextInt();

            if(valores[i] % 2 != 0){
                System.out.println(valores[i] +" é impar.");
                valores_impares[i] = valores[i];
            } 
            else{
                System.out.println(valores[i] +" é par.");
                valores_pares[i] = valores[i];
            }
        }
    }
}
