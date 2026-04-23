package EXERCICIOS.Ex_Estrutura_Condiconal;

/*
6. Construa um programa para determinar se o indivíduo está com um peso favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida como sendo a relação entre o peso (PESO – em kg) e o quadrado da Altura (ALTURA – em m) do indivíduo. Ou seja,
IMC= PESO/ALTURA2
e, a situação do peso é determinada pela tabela abaixo: 
*/

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();

        System.out.println("Digite seu altura:");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é:" + imc);

        if(imc < 17){
            System.out.println("Abaixo da magreza.");
        }
        else if(imc < 18.4){
            System.out.println("Magreza leve.");
        }
        else if(imc < 24.9){
            System.out.println("Peso normal/ideal.");
        }
        else if(imc < 29.9){
            System.out.println("Sobrepeso.");
        }
        else if(imc < 34.9){
            System.out.println("Obesidade Grau I.");
        }
        else if(imc < 39.9){
            System.out.println("Obesidade Grau II (severa).");
        }               
        else{
            System.out.println("Obesidade Grau III (mórbida).");
        };
    }
}
