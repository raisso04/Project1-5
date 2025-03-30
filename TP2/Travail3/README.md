# TP2 - Travail 3 : Opérateurs d'incrémentation

Ce travail explore le fonctionnement des opérateurs d'incrémentation en Java, en particulier la différence entre pré-incrémentation et post-incrémentation.

## Code Source

```java
class Main {
    public static void main(String[] args) {
        int i = 3;
        int a = i++;
        System.out.println("a = " + a);  // Affiche 3
        System.out.println("i = " + i);  // Affiche 4
    }
}
```

## Explication Détaillée

1. `int i = 3;`
   - Initialise la variable `i` avec la valeur 3

2. `int a = i++;` (Post-incrémentation)
   - L'opérateur `i++` est un opérateur de post-incrémentation
   - Il retourne d'abord la valeur actuelle de `i` (3)
   - Puis incrémente `i` de 1
   - Donc `a` reçoit la valeur 3, et `i` devient 4

### Comparaison avec la pré-incrémentation

Si on avait utilisé la pré-incrémentation (`++i`) à la place :
```java
int i = 3;
int a = ++i;  // i est d'abord incrémenté, puis sa valeur est assignée à a
```
Dans ce cas :
- `i` serait d'abord incrémenté à 4
- Puis `a` recevrait la valeur 4

## Compilation et Exécution

1. Compiler le code :
```bash
javac Main.java
```

2. Exécuter le programme :
```bash
java Main
```

## Résultat Attendu
```
a = 3
i = 4
```

Cette démonstration illustre une distinction importante en programmation Java entre les opérateurs de pré-incrémentation (`++i`) et de post-incrémentation (`i++`).