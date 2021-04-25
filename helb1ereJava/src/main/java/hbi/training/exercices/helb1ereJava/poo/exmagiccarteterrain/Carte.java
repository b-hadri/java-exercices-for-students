package hbi.training.exercices.helb1ereJava.poo.exmagiccarteterrain;

public abstract class Carte {
    private int cout;

    public Carte(int cout) {
        this.cout = cout;
    }

    public int getCout() {
        return cout;
    }

    public abstract void afficher();
}
