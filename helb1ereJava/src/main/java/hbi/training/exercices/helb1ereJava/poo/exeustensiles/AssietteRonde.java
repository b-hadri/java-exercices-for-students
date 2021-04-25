package hbi.training.exercices.helb1ereJava.poo.exeustensiles;

public class AssietteRonde extends Ustensile {

    private double rayon;

    public AssietteRonde(int annee, double rayon) {
        super(annee);
        this.rayon = rayon;
    }

    public double surface() {
        // return Math.PI * rayon * rayon;
        return Math.PI * Math.pow(rayon, 2);
    }
}
