# 📘 Java - Módulo 1: Fundamentos

---

## 1. Introdução ao Java

Java é uma linguagem de programação orientada a objetos, fortemente tipada e amplamente utilizada no mercado.

### Características principais:

* Orientada a Objetos
* Portável ("Write Once, Run Anywhere")
* Tipagem estática
* Executada na JVM (Java Virtual Machine)

### Como o Java funciona:

1. Você escreve o código (.java)
2. O compilador transforma em bytecode (.class)
3. A JVM executa esse código

---

## 2. Estrutura Básica de um Programa Java

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

### Explicação:

* `public class Main` → nome da classe (deve ser igual ao arquivo)
* `main` → ponto de entrada do programa
* `String[] args` → parâmetros da execução
* `System.out.println()` → saída de dados

---

## 3. Variáveis e Tipos de Dados

### Tipos primitivos:

| Tipo    | Descrição        | Exemplo |
| ------- | ---------------- | ------- |
| int     | Inteiro          | 10      |
| double  | Decimal          | 10.5    |
| char    | Caractere        | 'A'     |
| boolean | Verdadeiro/Falso | true    |

### Declaração de variáveis:

```java
int idade = 20;
double salario = 2500.50;
char letra = 'A';
boolean ativo = true;
```

### Regras importantes:

* Java é **fortemente tipado** → precisa declarar o tipo
* Não pode usar variável sem inicializar

---

## 4. Entrada e Saída de Dados

### Saída:

```java
System.out.println("Texto com quebra de linha");
System.out.print("Texto sem quebra");
```

### Entrada com Scanner:

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

int numero = sc.nextInt();
double valor = sc.nextDouble();
String texto = sc.nextLine();

sc.close();
```

### ⚠️ Pegadinha comum:

```java
int numero = sc.nextInt();
sc.nextLine(); // limpar buffer
String texto = sc.nextLine();
```

Se não limpar o buffer, o `nextLine()` pode pular entrada.

---

## 5. Operadores

### Aritméticos:

```java
+  -  *  /  %
```

Exemplo:

```java
int a = 10;
int b = 3;
System.out.println(a / b); // 3 (divisão inteira)
System.out.println(a % b); // 1 (resto)
```

---

### Relacionais:

```java
==  !=  >  <  >=  <=
```

Exemplo:

```java
System.out.println(10 > 5); // true
```

---

### Lógicos:

```java
&&  ||  !
```

Exemplo:

```java
boolean resultado = (10 > 5) && (5 > 2);
```

---

### Operadores de incremento:

```java
i++  // incrementa depois
++i  // incrementa antes
```

---

## 6. Boas Práticas

* Sempre inicialize variáveis
* Use nomes claros (ex: idade, salario)
* Feche o Scanner (`sc.close()`)
* Cuidado com divisão inteira
* Atenção ao uso do `nextLine()`

---
