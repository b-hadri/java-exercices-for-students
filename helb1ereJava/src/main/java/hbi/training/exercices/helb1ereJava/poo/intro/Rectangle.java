package hbi.training.exercices.helb1ereJava.poo.intro;

public class Rectangle {

    private int longueurEnCm;
    private int largeurEnCm;

    public Rectangle(int longueurEnCm, int largeurEnCm) {
        this.longueurEnCm = longueurEnCm;
        this.largeurEnCm = largeurEnCm;
    }

    public int peremitre() {
        return (longueurEnCm + largeurEnCm) * 2;
    }

    public int surface() {
        return longueurEnCm * largeurEnCm;
    }

    public int volumeAPartirDeLaHauteur(int hauteur) {
        return longueurEnCm * largeurEnCm * hauteur;
    }

    public int getLongueurEnCm() {
        return longueurEnCm;
    }

    public int getLargeurEnCm() {
        return largeurEnCm;
    }
}
