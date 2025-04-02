# Travail 2 - Analyse du Pseudocode FizzBuzz

## Description du problème
FizzBuzz est un jeu de programmation classique où l'on doit afficher une série de nombres avec des règles spécifiques :
- Si le nombre est divisible par 3, afficher "Fizz"
- Si le nombre est divisible par 5, afficher "Buzz"
- Si le nombre est divisible par 3 et 5, afficher "FizzBuzz"
- Sinon, afficher le nombre lui-même

## Pseudocode Original Fourni
```pseudocode
Entrées :
Valeur maximale : 100;

Variables :
Nombre entier : iterateur = 0;

Sorties : à l'écran

TANT QUE iterateur < 100 FAIRE
       affiche la valeur de iterateur à l'écran
       SI iterateur est divisible par 3 ALORS
         affiche " Fizz"  à l'écran
       SINON SI iterateur est divisible par 5 ALORS
         affiche " Buzz"  à l'écran
       FIN SI
       change de ligne à l'écran
       iterateur = iterateur + 1
FIN TANT QUE
```

## Analyse des Problèmes

### 1. Affichage Incorrect du Nombre
- **Problème** : Le pseudocode affiche systématiquement le nombre avant de vérifier les conditions
- **Impact** : Les nombres sont toujours affichés, même quand seul "Fizz" ou "Buzz" devrait apparaître
- **Exemple** : Pour 3, affiche "3 Fizz" au lieu de simplement "Fizz"

### 2. Absence de "FizzBuzz"
- **Problème** : Pas de vérification pour les nombres divisibles par 3 ET 5
- **Impact** : Les multiples de 15 n'affichent pas "FizzBuzz"
- **Exemple** : Pour 15, affiche "15 Fizz" au lieu de "FizzBuzz"

### 3. Logique de Conditions Incorrecte
- **Problème** : Structure SINON SI empêche la vérification complète
- **Impact** : Les multiples de 3 et 5 n'affichent que "Fizz"
- **Exemple** : Pour 30, affiche "30 Fizz" au lieu de "FizzBuzz"

## Solution Proposée
```pseudocode
Entrées :
Valeur maximale : 100;

Variables :
Nombre entier : iterateur = 0;

Sorties : à l'écran

TANT QUE iterateur < 100 FAIRE
       SI iterateur est divisible par 3 ET par 5 ALORS
           affiche "FizzBuzz" à l'écran
       SINON SI iterateur est divisible par 3 ALORS
           affiche "Fizz" à l'écran
       SINON SI iterateur est divisible par 5 ALORS
           affiche "Buzz" à l'écran
       SINON
           affiche la valeur de iterateur à l'écran
       FIN SI
       change de ligne à l'écran
       iterateur = iterateur + 1
FIN TANT QUE
```

## Exemples de Sortie Attendue
1. Pour 1 : "1"
2. Pour 3 : "Fizz"
3. Pour 5 : "Buzz"
4. Pour 15 : "FizzBuzz"
5. Pour 30 : "FizzBuzz"

## Points Clés d'Amélioration
1. Vérifier d'abord la condition combinée (divisible par 3 ET 5)
2. N'afficher le nombre que s'il ne correspond à aucune condition spéciale
3. Utiliser une structure SI-SINON SI-SINON appropriée

## Exécution Pas à Pas

### Initialisation
- **Valeur maximale** : 100 (condition d'arrêt de la boucle)
- **Variable** : iterateur = 0 (initialisation de la variable de boucle)

### Déroulement de la Boucle TANT QUE
La boucle continue tant que `iterateur < 100`

#### Premières Itérations

1. **Itération 0** :
   - iterateur = 0
   - 0 n'est pas divisible par 3 ni par 5
   - Affiche : "0"
   - Incrémente : iterateur = 1

2. **Itération 1** :
   - iterateur = 1
   - 1 n'est pas divisible par 3 ni par 5
   - Affiche : "1"
   - Incrémente : iterateur = 2

3. **Itération 3** :
   - iterateur = 3
   - 3 est divisible par 3
   - Affiche : "Fizz"
   - Incrémente : iterateur = 4

4. **Itération 5** :
   - iterateur = 5
   - 5 est divisible par 5
   - Affiche : "Buzz"
   - Incrémente : iterateur = 6

5. **Itération 15** :
   - iterateur = 15
   - 15 est divisible par 3 et par 5
   - Affiche : "FizzBuzz"
   - Incrémente : iterateur = 16

#### Suite des Itérations
La boucle continue avec le même modèle jusqu'à ce que `iterateur` atteigne 100 :
- Les multiples de 3 affichent "Fizz"
- Les multiples de 5 affichent "Buzz"
- Les multiples de 3 et 5 affichent "FizzBuzz"
- Les autres nombres s'affichent tels quels

### Fin de l'Exécution
- La boucle s'arrête quand `iterateur = 100`
- Le programme a traité tous les nombres de 0 à 99
- Chaque valeur a été affichée selon les règles FizzBuzz
