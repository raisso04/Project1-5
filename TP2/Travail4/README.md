# TP2 - Travail 4 : Immunité des chaînes de caractères

Ce travail explore l'immuabilité des chaînes de caractères (String) en Java et le passage par valeur des paramètres.

## Code Source

```java
public class TestMethode {
    
    public static void test(String test) {
        test = test + test;
    } 
    
    public static void main(String[] args) {
        String chaine = "test";
        test(chaine);
        System.out.println(chaine);  // Affiche "test"
    }
}
```

## Explication Détaillée

La valeur affichée sera `"test"`. Voici pourquoi :

1. **Passage par valeur**
   - En Java, les paramètres sont toujours passés par valeur
   - Quand `test(chaine)` est appelé, une copie de la référence est passée
   - Les modifications de la référence `test` dans la méthode n'affectent pas la variable `chaine` originale

2. **Immuabilité des String**
   - Les chaînes de caractères sont immuables en Java
   - L'opération `test + test` crée une nouvelle chaîne
   - La variable locale `test` pointe vers cette nouvelle chaîne
   - La variable `chaine` dans `main` continue de pointer vers la chaîne originale

## Diagramme de Mémoire

```
Avant l'appel :
chaine → "test"

Pendant test() :
chaine → "test"
test   → "test" → (après concatenation) → "testtest"

Après l'appel :
chaine → "test"
```

## Compilation et Exécution

1. Compiler le code :
```bash
javac TestMethode.java
```

2. Exécuter le programme :
```bash
java TestMethode
```

## Résultat Attendu
```
test
```

Cette démonstration illustre deux concepts fondamentaux en Java :
1. L'immuabilité des objets String
2. Le passage par valeur des paramètres de méthodes