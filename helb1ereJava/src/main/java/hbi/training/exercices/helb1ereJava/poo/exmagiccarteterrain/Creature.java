package hbi.training.exercices.helb1ereJava.poo.exmagiccarteterrain;

public class Creature extends Carte {

    private String nom;
    private int pointsDeDegats;
    private int pointsDeVie;

    public Creature(int cout, String nom, int pointsDeDegats, int pointsDeVie) {
        super(cout);

        this.nom = nom;
        this.pointsDeDegats = pointsDeDegats;
        this.pointsDeVie = pointsDeVie;

        System.out.println("Une nouvelle créature.");
    }

    @Override
    public void afficher() {
        System.out.println("Une créature " + this.nom + " " + this.pointsDeDegats + "/" + this.pointsDeVie);
    }
}
