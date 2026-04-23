# 📘 Java - Módulo 2: Lógica e Controle de Fluxo

---

## 1. Operadores

### Aritméticos

| Operador | Nome          | Exemplo | Resultado |
| -------- | ------------- | ------- | --------- |
| `+`      | Soma          | `5 + 3` | 8         |
| `-`      | Subtração     | `5 - 3` | 2         |
| `*`      | Multiplicação | `5 * 3` | 15        |
| `/`      | Divisão       | `5 / 2` | 2         |
| `%`      | Resto         | `5 % 2` | 1         |


### Operadores Relacionais

| Operador | Significado    | Exemplo  |
| -------- | -------------- | -------- |
| `==`     | Igual          | `a == b` |
| `!=`     | Diferente      | `a != b` |
| `>`      | Maior que      | `a > b`  |
| `<`      | Menor que      | `a < b`  |
| `>=`     | Maior ou igual | `a >= b` |
| `<=`     | Menor ou igual | `a <= b` |


### Operadores Lógicos

| Operador | Nome      | Exemplo         | Resultado |       |   |        |      |
| -------- | --------- | --------------- | --------- | ----- | - | ------ | ---- |
| `&&`     | E (AND)   | `true && false` | false     |       |   |        |      |
| `        |           | `               | OU (OR)   | `true |   | false` | true |
| `!`      | NÃO (NOT) | `!true`         | false     |       |   |        |      |

### Operadores de Incremento/Decremento

| Operador | Nome       | Exemplo | Explicação |
| -------- | ---------- | ------- | ---------- |
| `++`     | Incremento | `i++`   | usa depois |
| `++`     | Incremento | `++i`   | usa antes  |
| `--`     | Decremento | `i--`   | usa depois |
| `--`     | Decremento | `--i`   | usa antes  |

### Operadores de Atribuição

| Operador | Exemplo  | Equivalente |
| -------- | -------- | ----------- |
| `=`      | `a = 5`  | —           |
| `+=`     | `a += 3` | `a = a + 3` |
| `-=`     | `a -= 3` | `a = a - 3` |
| `*=`     | `a *= 3` | `a = a * 3` |
| `/=`     | `a /= 3` | `a = a / 3` |
| `%=`     | `a %= 3` | `a = a % 3` |

### Operador Terná| Operador | Estrutura                  |

| -------- | -------------------------- |
| `? :`    | condição ? valor1 : valor2 |

### Operador de Comparação de String (IMPORTANTE)

| Errado | Certo                 |
| ------ | --------------------- |
| `==`   | `.equals()`           |
|        | `.equalsIgnoreCase()` |


---

## 2. Estruturas Condicionais

### if / else

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

---

### if / else if / else

```java
int nota = 75;

if (nota >= 90) {
    System.out.println("A");
} else if (nota >= 70) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

---

### Operador ternário

```java
int idade = 20;
String resultado = (idade >= 18) ? "Maior" : "Menor";
```

---

### switch

```java
int dia = 1;

switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda");
        break;
    default:
        System.out.println("Outro dia");
}
```

⚠️ Pegadinha: esquecer o `break` causa execução em cascata.

---

## 3. Estruturas de Repetição

### for

Usado quando você sabe o número de repetições.

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

---

### while

Usado quando não sabe quantas vezes vai repetir.

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

---

### do-while

Executa pelo menos uma vez.

```java
int i = 0;

do {
    System.out.println(i);
    i++;
} while (i < 5);
```

---

## 4. Controle de Fluxo

### break

Interrompe o loop.

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```

---

### continue

Pula para a próxima iteração.

```java
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue;
    }
    System.out.println(i);
}
```

---

## 5. Boas Práticas

* Evite loops infinitos
* Sempre atualize a variável de controle
* Use `break` com cuidado
* Prefira `for` quando souber o número de repetições
* Indente corretamente

---
