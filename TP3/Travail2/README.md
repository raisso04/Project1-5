# TP3 - Travail 2 : Générateur de chaînes avec contraintes

Ce programme génère toutes les chaînes possibles de 4 caractères respectant certaines contraintes spécifiques.

## Objectif

Générer toutes les chaînes de 4 caractères avec les lettres 'a', 'b', 'c' et 'd' qui respectent les contraintes suivantes :
1. Si 'b' apparaît, il doit toujours être suivi de 'a'
2. Une chaîne ne peut pas contenir à la fois 'd' et 'a'
3. Une chaîne ne peut pas se terminer par 'b'

## Code Source

```java
public class GenerateStrings {
    public static void main(String[] args) {
        int count = 0;
        for (char c1 : new char[]{'a', 'b', 'c', 'd'}) {
            for (char c2 : new char[]{'a', 'b', 'c', 'd'}) {
                for (char c3 : new char[]{'a', 'b', 'c', 'd'}) {
                    for (char c4 : new char[]{'a', 'b', 'c', 'd'}) {
                        String s = "" + c1 + c2 + c3 + c4;
                        if (isValid(s)) {
                            System.out.println(s);
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println("Nombre total de chaînes : " + count);
    }

    private static boolean isValid(String s) {
        // Contraintes de validation
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'b' && s.charAt(i + 1) != 'a') return false;
        }
        if (s.contains("d") && s.contains("a")) return false;
        if (s.charAt(s.length() - 1) == 'b') return false;
        return true;
    }
}
```

## Fonctionnement détaillé

1. **Génération des chaînes**
   - Utilisation de 4 boucles imbriquées pour générer toutes les combinaisons possibles
   - Chaque position peut contenir 'a', 'b', 'c' ou 'd'
   - Total des combinaisons possibles avant contraintes : 4⁴ = 256

2. **Validation des contraintes**
   - Vérification que 'b' est toujours suivi de 'a'
   - Vérification de l'exclusion mutuelle entre 'd' et 'a'
   - Vérification que la chaîne ne se termine pas par 'b'

## Exemples de chaînes

1. Chaînes valides :
   - "aaaa" (respecte toutes les règles)
   - "baca" ('b' est suivi de 'a')
   - "ccdd" (pas de 'a' avec 'd')

2. Chaînes invalides :
   - "abcd" (contient 'a' et 'd')
   - "abbb" (se termine par 'b')
   - "abcc" ('b' n'est pas suivi de 'a')

## Compilation et Exécution

1. Compiler le programme :
```bash
javac -source 1.8 -target 1.8 TP3/Travail2/GenerateStrings.java
```

2. Exécuter le programme :
```bash
java TP3.Travail2.GenerateStrings
```

## Résultat

Le programme génère 44 chaînes valides au total. Voici quelques exemples de sortie :
```
aaaa
aaac
aaba
...
dddc
dddd
Nombre total de chaînes : 44
```

## Note technique

Le programme utilise une approche systématique pour :
1. Générer toutes les combinaisons possibles
2. Filtrer celles qui ne respectent pas les contraintes
3. Compter et afficher les chaînes valides