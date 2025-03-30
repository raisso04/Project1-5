package TP3.Travail1;

public class SommeNombres {

    // Méthode principale pour exécuter le programme
    public static void main(String[] args) {
        int somme = 0;

        // Boucle à travers les nombres de 1 à 10,000
        for (int i = 1; i <= 10000; i++) {
            // Vérifie si le nombre est divisible par 3
            if (i % 3 == 0) {
                continue; // Passe à l'itération suivante
            }

            // Vérifie si le chiffre de la centaine est 2 ou 3
            if (getCentaine(i) == 2 || getCentaine(i) == 3) {
                continue; // Passe à l'itération suivante
            }

            // Ajoute le nombre à la somme
            somme += i;
        }

        // Affiche la somme finale
        System.out.println("La somme est : " + somme);
    }

    // Méthode pour obtenir le chiffre de la centaine d'un nombre
    private static int getCentaine(int nombre) {
        return (nombre / 100) % 10;
    }
}
