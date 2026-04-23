package EXERCICIOS.Ex_Estrutura_Condiconal;

/*
4. Dados três valores X,Y,Z, verificar se eles podem ser os comprimentos dos lados de um triângulo. Se eles não formarem um triângulo escrever uma mensagem. Considerar que o comprimento de cada lado de um triângulo é menor que a soma dos outros dois lados.
*/

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do lado x:");
        int x = sc.nextInt();
        System.out.println("Digite o valor do lado y:");
        int y = sc.nextInt();
        System.out.println("Digite o valor do lado z:");
        int z = sc.nextInt();

        if(x + y > z && x + z > y && y + z > x){
            System.out.println("Os valores são válidos para um triângulo.");
        }        
        else{
            System.out.println("Os valores são inválidos para um triângulo.");
        }
    }
}