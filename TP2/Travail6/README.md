# TP2 - Travail 6 : Variables statiques vs Variables d'instance

Ce travail explore la différence entre les variables statiques (de classe) et les variables d'instance en Java.

## Premier cas : Variable Statique

### Code avec variable statique

```java
public class Bonhomme {
    public static String nom;

    public Bonhomme(String n) {
        nom = n;
    }
}
```

### Caractéristiques de la variable statique
- La variable `nom` est partagée entre toutes les instances
- Elle appartient à la classe plutôt qu'aux instances
- Une modification affecte toutes les instances

### Exemple d'utilisation

```java
public class TestBonhommeStatic {
    public static void main(String[] args) {
        Bonhomme bonhomme1 = new Bonhomme("Alice");
        Bonhomme bonhomme2 = new Bonhomme("Bob");

        System.out.println(bonhomme1.nom); // Affiche "Bob"
        System.out.println(bonhomme2.nom); // Affiche "Bob"
    }
}
```

## Deuxième cas : Variable d'Instance

### Code avec variable d'instance

```java
public class Bonhomme {
    public String nom;

    public Bonhomme(String n) {
        nom = n;
    }
}
```

### Caractéristiques de la variable d'instance
- Chaque instance a sa propre copie de la variable `nom`
- Les modifications sont isolées à chaque instance
- Les valeurs sont indépendantes entre les instances

### Exemple d'utilisation

```java
public class TestBonhommeInstance {
    public static void main(String[] args) {
        Bonhomme bonhomme1 = new Bonhomme("Alice");
        Bonhomme bonhomme2 = new Bonhomme("Bob");

        System.out.println(bonhomme1.nom); // Affiche "Alice"
        System.out.println(bonhomme2.nom); // Affiche "Bob"
    }
}
```

## Comparaison

| Aspect | Variable Statique | Variable d'Instance |
|--------|------------------|-------------------|
| Appartenance | À la classe | À l'objet |
| Partage | Partagée entre instances | Unique par instance |
| Modification | Affecte toutes les instances | Affecte une seule instance |
| Mémoire | Une seule copie | Une copie par instance |

## Cas d'utilisation

1. **Variables Statiques**
   - Compteurs partagés
   - Constantes de classe
   - Cache partagé
   - Configuration globale

2. **Variables d'Instance**
   - Attributs spécifiques à l'objet
   - État individuel
   - Données uniques par instance

## Compilation et Exécution

1. Compiler les fichiers :
```bash
javac Bonhomme.java TestBonhommeStatic.java TestBonhommeInstance.java
```

2. Exécuter les tests :
```bash
java TestBonhommeStatic
java TestBonhommeInstance
```

Cette démonstration illustre l'importance du choix entre variables statiques et d'instance selon les besoins de conception du programme.