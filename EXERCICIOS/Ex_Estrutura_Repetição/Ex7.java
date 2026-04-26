/*
7. Faça um programa que leia as notas de 5 alunos, e que exiba a maior e menor notas entre elas.
*/

package EXERCICIOS.Ex_Estrutura_Repetição;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    int nota_aluno;
    int maior_nota = 0;
    int menor_nota = 0;

    for(int i = 0; i < 5; i++){
        System.out.println("Digite a nota:");
        nota_aluno = sc.nextInt();

        if(i == 0){
            maior_nota = nota_aluno;
            menor_nota = nota_aluno;
        } else {
            if(nota_aluno > maior_nota){
                maior_nota = nota_aluno;
            }
            if(nota_aluno < menor_nota){
                menor_nota = nota_aluno;
            }
        }
    }

    System.out.println("Maior nota: " + maior_nota);
    System.out.println("Menor nota: " + menor_nota);
    }
}