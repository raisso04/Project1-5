package TP3.Travail2;

public class GenerateStrings {

    public static void main(String[] args) {
        int count = 0;

        // Générer toutes les chaînes de 4 caractères
        for (char c1 : new char[]{'a', 'b', 'c', 'd'}) {
            for (char c2 : new char[]{'a', 'b', 'c', 'd'}) {
                for (char c3 : new char[]{'a', 'b', 'c', 'd'}) {
                    for (char c4 : new char[]{'a', 'b', 'c', 'd'}) {
                        String s = Character.toString(c1) + Character.toString(c2) + Character.toString(c3) + Character.toString(c4);

                        // Vérifier les contraintes
                        if (isValid(s)) {
                            System.out.println(s);
                            count++;
                        }
                    }
                }
            }
        }

        // Afficher le nombre total de chaînes
        System.out.println("Nombre total de chaînes : " + count);
    }

    // Méthode pour vérifier si une chaîne est valide
    private static boolean isValid(String s) {
        // Vérifier si 'b' est toujours suivi de 'a'
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'b' && s.charAt(i + 1) != 'a') {
                return false;
            }
        }

        // Vérifier si la chaîne contient à la fois 'd' et 'a'
        if (s.contains("d") && s.contains("a")) {
            return false;
        }

        // Vérifier si la chaîne se termine par 'b'
        if (s.charAt(s.length() - 1) == 'b') {
            return false;
        }

        return true;
    }
}

    
