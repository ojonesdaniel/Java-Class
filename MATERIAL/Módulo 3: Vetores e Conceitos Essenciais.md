# 📘 Java - Módulo 3: Vetores e Conceitos Essenciais

---

## 1. O que são Vetores (Arrays)

Vetores são estruturas que armazenam múltiplos valores do **mesmo tipo** em uma única variável.

---

## 2. Declaração de Vetores

```java
int[] numeros = new int[5];
```

* Cria um vetor com 5 posições
* Índices vão de **0 a 4**

---

## 3. Inicialização Direta

```java
int[] numeros = {1, 2, 3, 4, 5};
```

---

## 4. Acessando Elementos

```java
System.out.println(numeros[0]); // primeiro elemento
numeros[1] = 10; // alterando valor
```

---

## 5. Percorrendo Vetores

### Usando for

```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

---

### Usando for-each

```java
for (int num : numeros) {
    System.out.println(num);
}
```

📌 Use for-each quando não precisar do índice

---

## 6. Entrada de Dados em Vetores

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int[] numeros = new int[5];

for (int i = 0; i < numeros.length; i++) {
    numeros[i] = sc.nextInt();
}

sc.close();
```

---

## 7. Operações Comuns com Vetores

### Soma dos elementos

```java
int soma = 0;

for (int i = 0; i < numeros.length; i++) {
    soma += numeros[i];
}
```

---

### Maior valor

```java
int maior = numeros[0];

for (int i = 1; i < numeros.length; i++) {
    if (numeros[i] > maior) {
        maior = numeros[i];
    }
}
```

---

### Contar pares

```java
int pares = 0;

for (int num : numeros) {
    if (num % 2 == 0) {
        pares++;
    }
}
```

---

## 8. Pegadinhas de Prova

### ❌ Erro de índice

```java
for (int i = 0; i <= numeros.length; i++) {
    // ERRO: estoura o vetor
}
```

✔️ Correto:

```java
for (int i = 0; i < numeros.length; i++) {
```

---

### ❌ Vetor não inicializado

```java
int[] numeros;
numeros[0] = 10; // erro
```

✔️ Correto:

```java
int[] numeros = new int[5];
```

---

## 9. Arrays de Outros Tipos

```java
String[] nomes = {"Ana", "João", "Carlos"};
double[] notas = new double[3];
```

---

## 10. Boas Práticas

* Sempre use `length` (nunca valor fixo)
* Inicialize o vetor antes de usar
* Evite acessar índices inválidos
* Use nomes claros (ex: notas, idades)

---

## 11. Exercícios Sugeridos (Nível Prova)

1. Leia 10 números e mostre apenas os pares
2. Armazene 5 notas e calcule a média
3. Encontre o maior e o menor valor de um vetor
4. Conte quantos números são maiores que a média
5. Inverta um vetor (ex: [1,2,3] → [3,2,1])

---

## 📌 Dica de Prova

* Sempre envolve: **vetor + for + if**
* Cuidado com índice fora do limite
* Comece pelo índice 0
* Use `.length` sempre

---

## 🚀 Próximo Passo

* Matrizes (vetores 2D)
* Métodos (funções)
* Introdução à Orientação a Objetos
