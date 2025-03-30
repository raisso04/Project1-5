# TP2 - Travail 2 : Précision des nombres à virgule flottante

Ce travail explore la précision des nombres à virgule flottante (double) en Java.

## Code Source

```java
class Main {
  public static void main(String[] args) {
    double x = 10.000000000000001;
    System.out.println(x);
  }
}
```

## Explication

Ce programme démontre un concept important en programmation :
- La variable `x` est déclarée avec une valeur très précise : 10.000000000000001
- En raison des limites de précision des nombres à virgule flottante (double), cette valeur sera arrondie à 10.0 lors de l'affichage
- Cela illustre que les doubles en Java ont une précision limitée (environ 15-17 chiffres significatifs)

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
10.0
```

Cette simplification du nombre illustre les limitations inhérentes à la représentation des nombres à virgule flottante en mémoire.