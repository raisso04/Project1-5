# TP2 - Travail 5 : Opérateurs logiques et ternaires

Ce travail explore l'utilisation des opérateurs logiques, bit à bit et de l'opérateur ternaire en Java.

## Code Source

```java
public class OperateursLogiques {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        
        int entier = (!a && (b | !a)) ? 10 : 20;
        
        System.out.println("Résultat : " + entier);
    }
}
```

## Analyse Détaillée

La valeur finale de `entier` sera `10`. Voici l'évaluation étape par étape :

1. **Évaluation des opérateurs logiques**
   ```java
   !a              // true  (car a est false)
   !a              // true  (dans la deuxième partie)
   b | !a          // true  (car !a est true, même si b est false)
   !a && (b | !a)  // true  (car les deux opérandes sont true)
   ```

2. **Types d'opérateurs utilisés**
   - `!` : Opérateur de négation logique
   - `|` : Opérateur OR bit à bit (dans ce contexte, agit comme OR logique)
   - `&&` : Opérateur AND logique
   - `?:` : Opérateur ternaire

3. **Opérateur ternaire**
   - Format : `condition ? valeur_si_vrai : valeur_si_faux`
   - Comme la condition est `true`, la valeur `10` est sélectionnée

## Table de vérité

| a | b | !a | b \| !a | !a && (b \| !a) | Résultat |
|---|---|----|---------|-----------------|-----------|
| F | F | T  | T       | T               | 10        |
| F | T | T  | T       | T               | 10        |
| T | F | F  | F       | F               | 20        |
| T | T | F  | T       | F               | 20        |

## Compilation et Exécution

1. Compiler le code :
```bash
javac OperateursLogiques.java
```

2. Exécuter le programme :
```bash
java OperateursLogiques
```

## Résultat Attendu
```
Résultat : 10
```

Cette démonstration illustre :
1. La priorité des opérateurs en Java
2. La différence entre opérateurs logiques (`&&`, `||`) et bit à bit (`&`, `|`)
3. L'utilisation de l'opérateur ternaire comme alternative concise aux instructions if-else