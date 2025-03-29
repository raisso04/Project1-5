# TP1 - Exercice 1 : Algorithme SommeDépasse100

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

## Fonctionnement
1. L'algorithme prend en entrée un tableau de nombres positifs
2. Il calcule la somme des éléments un par un
3. Si la somme dépasse 100 à un moment donné, il retourne vrai
4. Si la somme ne dépasse jamais 100, il retourne faux

## Structure du Projet
- `README.md` : Documentation du projet
- (Autres fichiers à venir)
