# TP4 - Validateur et Transposeur de Sudoku

## Objectif
Ce programme permet de valider et de transposer une grille de Sudoku. Il effectue trois opérations principales :
1. Lecture des données d'un fichier ou de l'entrée standard
2. Validation de la grille selon les règles du Sudoku
3. Transposition de la matrice et affichage du résultat

## Format des Données
Les données d'entrée doivent respecter le format suivant :
- Une série de triplets de chiffres séparés par des espaces
- Chaque triplet représente : `ligne colonne valeur`
- Les lignes et colonnes sont numérotées de 0 à 8
- Les valeurs doivent être comprises entre 1 et 9

Exemple de format valide :
```
012 023 034 045
123 134 145 156
```

## Validation
Le programme vérifie :
- Le format des triplets (exactement 3 chiffres)
- La validité des indices (0-8 pour lignes et colonnes)
- La validité des valeurs (1-9)
- L'unicité des valeurs dans chaque ligne et colonne
- Les cases déjà remplies (pas de doublons)

## Gestion des Erreurs
Le programme utilise deux types d'exceptions :
- `IOException` : Pour les erreurs de lecture de fichier
- `SudokuException` : Pour les erreurs de validation (format, valeurs, règles du Sudoku)

Chaque erreur génère un message détaillé indiquant :
- Le numéro de ligne dans le fichier
- Le type d'erreur
- Les valeurs problématiques

## Utilisation

### Compilation
```bash
javac -source 1.8 -target 1.8 Sudoku.java
```

### Exécution
1. Avec un fichier :
```bash
java Sudoku partie1.txt [partie2.txt ...]
```

2. Avec l'entrée standard :
```bash
java Sudoku
```
(Entrez ensuite les triplets ligne par ligne)

## Affichage
Le programme affiche :
1. La grille initiale
2. La grille transposée
3. Les messages d'erreur éventuels

Format d'affichage :
```
. . . | . . . | . . .
. . . | . . . | . . .
. . . | . . . | . . .
- - - - - - - - - - - -
. . . | . . . | . . .
. . . | . . . | . . .
. . . | . . . | . . .
- - - - - - - - - - - -
. . . | . . . | . . .
. . . | . . . | . . .
. . . | . . . | . . .
```

## Exemple d'Utilisation
```bash
java Sudoku partie1.txt
```

Sortie :
```
Test avec partie1.txt :
==================================================
Grille initiale :
1 . . | . . . | . . .
. . . | . . . | . . .
. . . | . . . | . . .
- - - - - - - - - - - -
. . . | . . . | . . .
. . . | . . . | . . .
. . . | . . . | . . .
- - - - - - - - - - - -
. . . | . . . | . . .
. . . | . . . | . . .
. . . | . . . | . . .

Grille transposée :
1 . . | . . . | . . .
. . . | . . . | . . .
. . . | . . . | . . .
- - - - - - - - - - - -
. . . | . . . | . . .
. . . | . . . | . . .
. . . | . . . | . . .
- - - - - - - - - - - -
. . . | . . . | . . .
. . . | . . . | . . .
. . . | . . . | . . .
==================================================