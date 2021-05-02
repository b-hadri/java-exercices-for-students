package hbi.training.exercices.helb1ereJava.poo.interfaceex03;

public abstract class MoyenDeTransport implements IDeplacement {

    protected int x;
    protected int y;
    protected int vitesse;

    final protected int VITESSE_INITIALE = 10;

    public MoyenDeTransport(int x, int y, int vitesse) {
        this.x = x;
        this.y = y;
        this.vitesse = vitesse;
    }

    public void afficher() {
        System.out.println("La position est "+this.x+" / "+this.y);
    }

    public void limitation(int nouvelleVitesse, int limiteFixée) {
        if (nouvelleVitesse > limiteFixée) {
            this.vitesse = limiteFixée;
        } else {
            this.vitesse = nouvelleVitesse;
        }
    }

}
