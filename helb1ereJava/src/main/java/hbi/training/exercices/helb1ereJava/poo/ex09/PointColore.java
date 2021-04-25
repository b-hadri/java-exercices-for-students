package hbi.training.exercices.helb1ereJava.poo.ex09;

public class PointColore extends Point {

    private String couleur;

    public PointColore(double x, double y) {
        super(x, y);
        this.couleur = "blanc";
    }

    public PointColore(double x, double y, String couleur) {
        super(x, y);
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public void afficher() {
        System.out.println("(" + this.getX() + "," + this.getY() + ") + couleur = " + this.couleur);
    }
}
