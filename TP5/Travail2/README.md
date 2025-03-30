# TP5 - Travail 2 : Interfaces et Implémentation Multiple en Java

## Objectif
Ce travail pratique explore l'utilisation des interfaces en Java et démontre comment une classe peut implémenter plusieurs interfaces, illustrant ainsi le concept d'héritage multiple d'interfaces.

## Structure du Projet

### Interfaces
1. **Forme**
   ```java
   public interface Forme {
       double getPerimeter();
   }
   ```
   - Interface définissant le comportement d'une forme géométrique
   - Méthode `getPerimeter()` pour calculer le périmètre

2. **Resizable**
   ```java
   public interface Resizable {
       void resize(double d);
   }
   ```
   - Interface permettant de redimensionner un objet
   - Méthode `resize(double d)` pour modifier la taille

### Implémentation
**Classe Cercle**
```java
public class Cercle implements Forme, Resizable {
    private double diametre;
    // ...
}
```
- Implémente les deux interfaces
- Gère le diamètre du cercle
- Calcule le périmètre (π × diamètre)
- Permet le redimensionnement du cercle

## Concepts Clés

### 1. Implémentation Multiple
- Une classe peut implémenter plusieurs interfaces
- Obligation d'implémenter toutes les méthodes des interfaces
- Solution Java pour l'héritage multiple

### 2. Contrats d'Interface
- Les interfaces définissent un contrat
- Les classes implémentant doivent respecter ce contrat
- Permet la standardisation des comportements

### 3. Polymorphisme par Interface
- Un objet peut être référencé par ses types d'interface
- Permet une grande flexibilité dans la conception
- Facilite l'extension du code

## Utilisation

### Création d'un Cercle
```java
Cercle cercle = new Cercle(5.0);
```

### Manipulation via les Interfaces
```java
Forme forme = cercle;           // Vue comme une forme
Resizable resizable = cercle;   // Vue comme redimensionnable

System.out.println(forme.getPerimeter());  // Calcul du périmètre
resizable.resize(2.0);                    // Doublement de la taille
```

## Points Importants
1. Une interface ne peut contenir que des déclarations de méthodes et des constantes
2. Toutes les méthodes d'interface sont implicitement `public abstract`
3. Une classe doit implémenter toutes les méthodes des interfaces ou être déclarée abstraite
4. L'implémentation multiple d'interfaces évite les problèmes du diamant de l'héritage multiple

## Exercices Suggérés
1. Ajoutez une nouvelle interface `Comparable`
2. Créez une classe `Rectangle` implémentant les mêmes interfaces
3. Implémentez une collection de formes redimensionnables
4. Ajoutez des méthodes de comparaison entre formes

## Conclusion
L'utilisation des interfaces en Java permet de créer des designs flexibles et extensibles, tout en évitant les complications de l'héritage multiple de classes.

Explications supplémentaires :
Encapsulation : Les attributs diametre et taille sont privés pour respecter le principe d'encapsulation, ce qui signifie que leur accès est contrôlé via des méthodes publiques.
Flexibilité : En utilisant des interfaces, nous pouvons facilement ajouter de nouvelles formes géométriques qui doivent également être redimensionnables, sans modifier la hiérarchie existante.
Réutilisabilité : Les méthodes getPerimeter() et resize(double d) peuvent être réutilisées dans d'autres contextes où des formes géométriques et des opérations de redimensionnement sont nécessaires.