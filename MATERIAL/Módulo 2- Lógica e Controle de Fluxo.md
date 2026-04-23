# 📘 Java - Módulo 2: Lógica e Controle de Fluxo

---

## 1. Operadores

### Aritméticos

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

### Relacionais

```java
==  !=  >  <  >=  <=
```

Exemplo:

```java
System.out.println(10 >= 10); // true
```

---

### Lógicos

```java
&&  ||  !
```

Exemplo:

```java
boolean resultado = (10 > 5) && (5 < 3); // false
```

---

### Incremento e Decremento

```java
i++  // pós-incremento
++i  // pré-incremento
i--  // pós-decremento
--i  // pré-decremento
```

⚠️ Pegadinha:

```java
int i = 5;
System.out.println(i++); // imprime 5, depois vira 6
System.out.println(++i); // vira 7, depois imprime 7
```

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
