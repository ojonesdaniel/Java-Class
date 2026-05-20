/*
14. Verificar matriz identidade
Leia uma matriz 3x3 e verifique se ela é uma matriz identidade.
Exemplo de matriz identidade
1 0 0
0 1 0
0 0 1
*/

package EXERCICIOS.Ex_Matrizes.Ex_Douglas_Matriz;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int mat[][] = new int[3][3];
        boolean res = false;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){                
                do{
                    System.out.println("Digite 0 ou 1 para posição [" + i + "], [" + j + "].");        
                    mat[i][j] = sc.nextInt();
                }
                while(mat[i][j] != 0 && mat[i][j] != 1);
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == j && mat[i][j] != 1){
                    res = true;
                }
                else if(i != j && mat[i][j] == 0){
                    res = true;
                }
            }
        }
        System.out.println(res);      
    }
}
