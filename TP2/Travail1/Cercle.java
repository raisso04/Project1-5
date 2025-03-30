public class Cercle {
    private double rayon;

    // Constructeur recevant un rayon
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    // Méthode pour calculer l'aire du cercle
    public double aire() {
        return Math.PI * rayon * rayon;
    }

    // Méthode pour calculer le périmètre du cercle
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    // Exemple d'utilisation
    public static void main(String[] args) {
        Cercle c = new Cercle(1);
        System.out.println("Aire : " + c.aire());
        System.out.println("Périmètre : " + c.perimetre());
    }
}
