/* 
5. Faça um programa que solicite ao usuário que informe o valor das temperaturas coletadas nos 10 primeiros dias 
do mês de janeiro de 2021, em Belo Horizonte. Imprima em seguida a média dessas temperaturas.
*/

package EXERCICIOS.Ex_Estrutura_Repetição;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double[] temperaturas = new double[10];
        double soma_temperaturas = 0;

        for(int i = 0; i < temperaturas.length; i++){
            System.out.println("Digite a temperatura referente ao dia " + (i+1) + " de janeiro");
            temperaturas[i] = sc.nextDouble();

            soma_temperaturas += temperaturas[i];
        }

        double media_temperaturas = soma_temperaturas / temperaturas.length;
        System.out.println("A média das temperaturas é igual a: " + media_temperaturas + " °C.");
    }
}
