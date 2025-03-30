package TP5.Travail2;

public class Cercle implements Forme, Resizable {
    private double diametre;

    public Cercle(double diametre) {
        this.diametre = diametre;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * diametre;
    }

    @Override
    public void resize(double d) {
        this.diametre *= d;
    }
}
