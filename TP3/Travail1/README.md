# TP3 - Travail 1 : Somme de nombres avec conditions

Ce programme calcule la somme des nombres de 1 à 10,000 en excluant certains nombres selon des critères spécifiques.

## Objectif

Calculer la somme des nombres qui :
- Ne sont pas divisibles par 3
- N'ont pas 2 ou 3 comme chiffre des centaines

## Code Source

```java
public class SommeNombres {
    public static void main(String[] args) {
        int somme = 0;
        for (int i = 1; i <= 10000; i++) {
            if (i % 3 == 0) continue;
            if (getCentaine(i) == 2 || getCentaine(i) == 3) continue;
            somme += i;
        }
        System.out.println("La somme est : " + somme);
    }

    private static int getCentaine(int nombre) {
        return (nombre / 100) % 10;
    }
}
```

## Fonctionnement détaillé

1. **Boucle principale**
   - Parcourt les nombres de 1 à 10,000
   - Utilise une boucle `for` avec un compteur `i`

2. **Conditions d'exclusion**
   - `i % 3 == 0` : exclut les nombres divisibles par 3
   - `getCentaine(i) == 2 || getCentaine(i) == 3` : exclut les nombres avec 2 ou 3 aux centaines

3. **Méthode getCentaine**
   - Extrait le chiffre des centaines d'un nombre
   - Utilise la division entière (`/`) et le modulo (`%`)
   - Exemple : pour 1234, retourne 2 (car 1**2**34)

## Exemples de calcul

- Pour 123 :
  - Divisible par 3 (123 ÷ 3 = 41) → exclu
- Pour 245 :
  - Non divisible par 3
  - Chiffre des centaines = 2 → exclu
- Pour 145 :
  - Non divisible par 3
  - Chiffre des centaines = 1 → inclus dans la somme

## Compilation et Exécution

1. Compiler le programme :
```bash
javac -source 1.8 -target 1.8 TP3/Travail1/SommeNombres.java
```

2. Exécuter le programme :
```bash
java TP3.Travail1.SommeNombres
```

## Résultat

```
La somme est : 26937467
```

## Note technique

Le programme utilise l'instruction `continue` pour sauter les itérations qui ne respectent pas les critères, ce qui rend le code plus efficace en évitant des imbrications de conditions.