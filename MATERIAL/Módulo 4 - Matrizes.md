# 📘 Matrizes em Java

## 📌 O que é uma matriz?

Uma matriz em Java é um array bidimensional.

Enquanto um vetor possui apenas uma dimensão, a matriz possui:
- linhas
- colunas

Exemplo visual:

```text
[1][2][3]
[4][5][6]
[7][8][9]
🧠 Estrutura de uma matriz
✅ Declaração
int[][] matriz;
✅ Inicialização
int[][] matriz = new int[3][3];

Isso cria:

3 linhas
3 colunas
📌 Índices da matriz
matriz[linha][coluna]

Exemplo:

matriz[0][0] = 10;
📘 Exemplo simples
public class Main {
    public static void main(String[] args) {

        int[][] matriz = new int[2][2];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;

        System.out.println(matriz[0][0]);
        System.out.println(matriz[1][1]);
    }
}
📥 Lendo valores com Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[2][2];

        for (int linha = 0; linha < 2; linha++) {

            for (int coluna = 0; coluna < 2; coluna++) {

                System.out.println("Digite um valor:");
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        sc.close();
    }
}
📤 Exibindo uma matriz
for (int linha = 0; linha < 2; linha++) {

    for (int coluna = 0; coluna < 2; coluna++) {

        System.out.print(matriz[linha][coluna] + " ");
    }

    System.out.println();
}
🧠 Estrutura padrão de matriz
for (int i = 0; i < matriz.length; i++) {

    for (int j = 0; j < matriz[i].length; j++) {

        System.out.println(matriz[i][j]);
    }
}
📌 Entendendo o .length
Código	Significado
matriz.length	quantidade de linhas
matriz[i].length	quantidade de colunas
📘 Inicialização direta
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
📌 Soma de todos os elementos
int soma = 0;

for (int i = 0; i < matriz.length; i++) {

    for (int j = 0; j < matriz[i].length; j++) {

        soma += matriz[i][j];
    }
}

System.out.println("Soma: " + soma);
📌 Encontrar maior valor
int maior = matriz[0][0];

for (int i = 0; i < matriz.length; i++) {

    for (int j = 0; j < matriz[i].length; j++) {

        if (matriz[i][j] > maior) {

            maior = matriz[i][j];
        }
    }
}

System.out.println("Maior valor: " + maior);
📌 Diagonal principal

Elementos onde:

linha == coluna

Exemplo:

[1][ ][ ]
[ ][5][ ]
[ ][ ][9]
✅ Código
for (int i = 0; i < matriz.length; i++) {

    System.out.println(matriz[i][i]);
}
📌 Diagonal secundária

Condição:

linha + coluna == tamanho - 1
✅ Código
for (int i = 0; i < matriz.length; i++) {

    System.out.println(matriz[i][matriz.length - 1 - i]);
}
📌 Matrizes irregulares
int[][] matriz = new int[3][];

Cada linha pode ter tamanhos diferentes.

📘 Exemplo
matriz[0] = new int[2];
matriz[1] = new int[4];
matriz[2] = new int[1];
📌 Foreach com matriz
for (int[] linha : matriz) {

    for (int valor : linha) {

        System.out.println(valor);
    }
}
⚠️ Erros comuns em prova
❌ Índice inválido
matriz[3][3]

Em uma matriz 3x3, o máximo é:

matriz[2][2]
❌ Esquecer o segundo for
for (...) {
    // percorre apenas linhas
}

Matrizes precisam de:

for externo → linhas
for interno → colunas
❌ Confundir linha e coluna
matriz[coluna][linha]
📌 Casos clássicos de prova
Soma de linhas
Soma de colunas
Maior elemento
Menor elemento
Média
Diagonal principal
Diagonal secundária
Transposição
Matriz identidade
📘 Matriz identidade
1 0 0
0 1 0
0 0 1

Características:

diagonal principal = 1
resto = 0
📘 Exemplo
int[][] identidade = {
    {1, 0, 0},
    {0, 1, 0},
    {0, 0, 1}
};
🧠 Diferença: Vetor vs Matriz
Vetor	Matriz
1 dimensão	2 dimensões
vetor[i]	matriz[i][j]
🚀 Boas práticas
✅ Use nomes claros
linha
coluna
✅ Use .length

Evite:

for (int i = 0; i < 3; i++)

Prefira:

for (int i = 0; i < matriz.length; i++)
🎯 Resumo Final

Matrizes em Java:

são arrays bidimensionais
usam [linha][coluna]
normalmente usam for aninhado
caem MUITO em prova
🔥 Estrutura que você deve decorar
for (int i = 0; i < matriz.length; i++) {

    for (int j = 0; j < matriz[i].length; j++) {

        System.out.println(matriz[i][j]);
    }
}