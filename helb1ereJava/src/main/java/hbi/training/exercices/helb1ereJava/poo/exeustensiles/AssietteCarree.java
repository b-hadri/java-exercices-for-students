package hbi.training.exercices.helb1ereJava.poo.exeustensiles;

public class AssietteCarree extends Ustensile {
    private double cote;

    public AssietteCarree(int annee, double cote) {
        super(annee);
        this.cote = cote;
    }

    public double surface() {
        return cote * cote;
    }

}
