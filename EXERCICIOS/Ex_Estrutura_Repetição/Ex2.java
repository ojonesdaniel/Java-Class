package EXERCICIOS.Ex_Estrutura_Repetição;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double soma_salario = 0;
        int contador_salario = 0;

        double soma_filhos = 0;
        int contador_familias = 0;

        System.out.println("Digite o valor do sálario:");
        double salario = sc.nextDouble();

        while (salario >= 0) {

            System.out.println("Digite o número de filhos:");
            int num_filhos = sc.nextInt();
            
            /*Pegando média do sálario*/
            soma_salario = soma_salario + salario;
            contador_salario = contador_salario + 1;

            /*Pegando média do número de filhos*/
            soma_filhos = soma_filhos + num_filhos;
            contador_familias = contador_familias + 1;

            /*Pegando as informações de novo*/
            System.out.println("Digite o valor do sálario:");
            salario = sc.nextDouble();
        }

        /*Calculando a média dos valores coletados*/
        if (contador_salario > 0) {
            double media_salario = soma_salario / contador_salario;
            double media_num_filhos = soma_filhos / contador_familias;

            System.out.println("A média de sálarios é: " + media_salario);
            System.out.println("A média de números de filhos é: " + media_num_filhos);
        } else {
            System.out.println("Nenhum dado válido foi informado.");
        }
    }
}