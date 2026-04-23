/* 
8. Faça um programa que receba a idade de um nadador e mostre a sua categoria
IDADE
CATEGORIA
até 7 anos
INFANTIL
8 a 10 anos
JUVENIL
11 a 15 anos
ADOLESCENTE
16 a 30 anos
ADULTO
acima de 30 anos
SENIOR

*/

package EXERCICIOS.Ex_Estrutura_Condiconal;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        if(idade < 7){
            System.out.println("INFANTIL");
        }
        else if(idade < 10){
            System.out.println("JUVENIL");
        }
        else if(idade < 15){
            System.out.println("ADOLESCENTE");
        }
        else if(idade < 30){
            System.out.println("ADULTO");
        }
        else{
            System.out.println("SENIOR");
        }
    }
}
