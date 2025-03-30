# Travail 1 - Exercice 1 : Algorithme SommeDépasse100

## Description
Cet algorithme vérifie si la somme des éléments d'un tableau dépasse 100.

## Pseudocode
```pseudocode
Algorithme SommeDépasse100
  Entrée : tableau (un tableau de nombres positifs)
  Sortie : booléen (vrai si la somme dépasse 100, faux sinon)

  somme ← 0

  Pour chaque élément dans tableau
    somme ← somme + élément
    Si somme > 100
      Retourner vrai
    Fin Si
  Fin Pour

  Retourner faux
Fin Algorithme
```

## Explications détaillées

### Initialisation
- Définir une variable `somme` et l'initialiser à 0.

### Boucle principale
- Pour chaque élément dans le tableau :
  - Ajouter l'élément à `somme`
  - Si `somme` dépasse 100, retourner vrai

### Fin de boucle
- Si la boucle se termine sans que `somme` n'ait dépassé 100, retourner faux

## Cas particuliers et optimisations

### Cas particuliers
1. **Tableau vide**: Si le tableau est vide, la somme sera 0, donc l'algorithme retournera faux.
2. **Tableau de grande taille**: L'algorithme est conçu pour s'arrêter dès que la somme dépasse 100.

### Résultats des tests
- test_1 ([55, 55, 55, 55]) : Vrai (somme = 220)
- test_2 ([1, 2, 3, 5, 6]) : Faux (somme = 17)
- test_3 ([]) : Faux (somme = 0)
- test_4 ([100]) : Faux (somme = 100)
- test_5 ([1] * 1,000,000) : Vrai (somme = 1,000,000)
- test_6 ([50, 51]) : Vrai (somme = 101)
- test_7 ([101]) : Vrai (somme = 101)
- test_8 ([0.5] * 201) : Vrai (somme = 100.5)

### Optimisations possibles
1. **Approche parallèle**: Pour les très grands tableaux, possibilité de diviser en segments et calculer en parallèle
2. **Vérification précoce**: Arrêt dès que la somme dépasse 100, optimisant le temps de calcul
