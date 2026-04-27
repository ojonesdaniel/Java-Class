package EXERCICIOS.Ex_Vetores;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetor_1 = new int[5];
        int[] vetor_2 = new int[5];
        int[] vetor_3 = new int[10];

        int qtd = 0; // controla quantos elementos tem no vetor_3

        /* PEGANDO OS VALORES DO PRIMEIRO VETOR */
        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número para o vetor_1:");
            vetor_1[i] = sc.nextInt(); 
        }

        /* COPIANDO vetor_1 PARA vetor_3 */
        for(int i = 0; i < 5; i++){
            vetor_3[qtd] = vetor_1[i];
            qtd++;
        }

        /* PEGANDO OS VALORES DO SEGUNDO VETOR */
        for(int x = 0; x < 5; x++){
            System.out.println("Digite um número para o vetor_2:");
            vetor_2[x] = sc.nextInt(); 

            boolean encontrado = false;

            // verifica se já existe no vetor_3
            for(int i = 0; i < qtd; i++){
                if(vetor_2[x] == vetor_3[i]){
                    encontrado = true;
                    break;
                }
            }

            // se não encontrou, adiciona
            if(!encontrado){
                vetor_3[qtd] = vetor_2[x];
                qtd++;
            }
        }

        /* MOSTRANDO RESULTADO */
        System.out.println("Vetor união (sem repetição):");
        for(int i = 0; i < qtd; i++){
            System.out.print(vetor_3[i] + " ");
        }
    }
}