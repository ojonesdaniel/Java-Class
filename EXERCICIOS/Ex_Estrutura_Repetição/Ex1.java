package EXERCICIOS.Ex_Estrutura_Repetição;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int matricula; 
        int nota_matematica, nota_portugues, nota_artes;

        /*Pegando Matricula do Aluno*/
        System.out.println("Digite a matricula do aluno:");
        matricula = sc.nextInt();

        while(matricula >= 0){

            /*Pegando as notas do Aluno*/
            System.out.println("Digite a nota de matematica do aluno:");
            nota_matematica = sc.nextInt();

            System.out.println("Digite a nota de portugues do aluno:");
            nota_portugues = sc.nextInt();

            System.out.println("Digite a nota de artes do aluno:");
            nota_artes = sc.nextInt();
    
            /*Calculando a média das notas*/
            double media_notas = (nota_artes + nota_matematica + nota_portugues) / 3.0;

            /*Validando situação do aluno*/            
            if(media_notas >= 70){
                System.out.println("O aluno " + matricula + " foi aprovado com a nota de: " + media_notas);
            }
            else if(media_notas >= 60){
                System.out.println("O aluno " + matricula + " foi para exame com a nota de: " + media_notas);
            }
            else{
                System.out.println("O aluno " + matricula + " foi para reprovado com a nota de: " + media_notas);
            }

            /*Pegando Matricula do Aluno*/
            System.out.println("Digite a matricula do aluno:");
            matricula = sc.nextInt();
        }
    }
}