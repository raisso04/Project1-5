# TP5 - Travail 1 : Héritage et Polymorphisme en Java

## Objectif
Ce travail pratique explore les concepts fondamentaux de l'héritage et du polymorphisme en Java à travers une hiérarchie de classes d'animaux.

## Concepts Clés
1. Héritage de classes
2. Polymorphisme
3. Casting (conversion de types)
4. Méthodes virtuelles
5. Liaison dynamique

## Structure des Classes
```
Animal (classe de base)
   ↓
Chien (hérite d'Animal)
   ↓
GrosChien (hérite de Chien)
```

## Analyse du Code

### 1. Déclarations et Instanciations
```java
Animal animal1 = new Animal();
Animal animal2 = new Chien();    // Polymorphisme
Animal animal3 = new GrosChien(); // Polymorphisme
```

### 2. Conversions de Types (Casting)
```java
Chien dog2 = (Chien)animal2;     // Valide : animal2 est un Chien
GrosChien bigDog2 = (GrosChien)animal3; // Valide : animal3 est un GrosChien
Chien dog3 = (Chien)animal3;     // Valide : GrosChien est une sous-classe de Chien
```

### 3. Appels de Méthodes
```java
dog2.greeting(dog3);    // "Woooooooooof!"
dog3.greeting(dog2);    // "Woooooooooof!"
dog2.greeting(bigDog2); // "Woooooooooof!"
bigDog2.greeting(dog2); // "Woow!"
```

## Points Importants

### Polymorphisme
- Une référence de type parent peut pointer vers un objet de type enfant
- Le comportement réel dépend du type de l'objet à l'exécution

### Casting
- Le casting vers le bas (downcasting) nécessite une conversion explicite
- Le casting est sûr uniquement si l'objet est du type cible ou d'une sous-classe
- Une exception `ClassCastException` est levée si le casting est invalide

### Liaison Dynamique
- La méthode appelée est déterminée au moment de l'exécution
- Dépend du type réel de l'objet, pas du type de la référence

## Règles à Retenir
1. Un objet d'une sous-classe peut être assigné à une référence de sa superclasse
2. Le casting est nécessaire pour accéder aux méthodes spécifiques de la sous-classe
3. Vérifiez toujours le type réel de l'objet avant le casting avec `instanceof`
4. Les méthodes surchargées sont résolues au moment de l'exécution

## Exemples de Code

### Vérification de Type
```java
if (animal2 instanceof Chien) {
    Chien dog = (Chien)animal2;
    dog.greeting(new Chien());
}
```

### Hiérarchie d'Appels
```java
Animal a = new GrosChien();
a.greeting();      // Appelle la version GrosChien
((Chien)a).greeting(); // Même comportement
```

## Exercices Suggérés
1. Ajoutez une nouvelle sous-classe `PetitChien`
2. Implémentez différentes versions de `greeting()`
3. Testez différentes combinaisons de casting
4. Gérez les exceptions de casting invalide

## Conclusion
La compréhension de l'héritage et du polymorphisme est fondamentale en programmation orientée objet. Ces concepts permettent de créer du code plus flexible et réutilisable.

Analysons le code et les résultats ou erreurs potentiels lors de l'exécution du programme Main :

Instanciation et appels de méthodes :

Chat cat1 = new Chat(); cat1.greeting();
Affiche "Meow!" car la méthode greeting de Chat est appelée.
Chien dog1 = new Chien(); dog1.greeting();
Affiche "Woof!" car la méthode greeting de Chien est appelée.
GrosChien bigDog1 = new GrosChien(); bigDog1.greeting();
Affiche "Woow!" car la méthode greeting de GrosChien est appelée.
Polymorphisme :

Animaux animal1 = new Chien(); animal1.greeting();
Affiche "Woof!" car animal1 référence un objet Chien, et la méthode greeting de Chien est appelée.
Animaux animal2 = new Chien(); animal2.greeting();
Affiche "Woof!" pour la même raison que ci-dessus.
Animaux animal3 = new GrosChien(); animal3.greeting();
Affiche "Woow!" car animal3 référence un objet GrosChien, et la méthode greeting de GrosChien est appelée.
Casting et appels de méthodes :

Chien dog2 = (Chien)animal2;
Valide car animal2 est un Chien.
GrosChien bigDog2 = (GrosChien)animal3;
Valide car animal3 est un GrosChien.
Chien dog3 = (Chien)animal3;
Valide car animal3 est un GrosChien, qui est une sous-classe de Chien.
Appels de méthodes avec paramètres :

dog2.greeting(dog3);
Affiche "Woooooooooof!" car dog2 est un Chien et dog3 est un Chien.
dog3.greeting(dog2);
Affiche "Woooooooooof!" car dog3 est un GrosChien (qui est aussi un Chien) et dog2 est un Chien.
dog2.greeting(bigDog2);
Affiche "Woooooooooof!" car dog2 est un Chien et bigDog2 est un GrosChien (qui est aussi un Chien).
bigDog2.greeting(dog2);
Affiche "Woooooowwwww!" car bigDog2 est un GrosChien et dog2 est un Chien.
bigDog2.greeting(bigDog1);
Affiche "Woooooowwwww!" car bigDog2 est un GrosChien et bigDog1 est un GrosChien.
Erreur de casting :

Chat cat2 = (Chat)animal2;
Erreur de ClassCastException : animal2 est un Chien, et il ne peut pas être casté en Chat. Cela provoquera une exception à l'exécution.