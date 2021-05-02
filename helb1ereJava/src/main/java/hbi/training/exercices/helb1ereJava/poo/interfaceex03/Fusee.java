package hbi.training.exercices.helb1ereJava.poo.interfaceex03;

public class Fusee extends MoyenDeTransport {

    private int vitesseMaximale = this.VITESSE_INITIALE * 100;
    private int deplacementMaximal = 1200;

    public Fusee(int x, int y, int vitesse) {
        super(x, y, vitesse);
    }

    @Override
    public void deplacementEnX() {

        if (verifierDepassementVitesseMaximale()) {
            System.out.println("La vitesse est trop grande. Pas de déplacement.");
            System.out.println("La vitesse ne peut dépasser "+vitesseMaximale+". Pas de déplacement");
            return;
        }

        if ( (this.x + this.vitesse)  > deplacementMaximal) {
            System.out.println("Le déplacement ne peut dépasser "+deplacementMaximal+". Pas de déplacement");
            return;
        }

        this.x += this.vitesse;

    }

    private boolean verifierDepassementVitesseMaximale() {
        return this.vitesse > vitesseMaximale;
    }

    @Override
    public void deplacementEnY() {

        if (verifierDepassementVitesseMaximale()) {
            System.out.println("La vitesse est trop grande. Pas de déplacement.");
            System.out.println("La vitesse ne peut dépasser "+vitesseMaximale+". Pas de déplacement");
            return;
        }

        if ( (this.y + this.vitesse)  > deplacementMaximal) {
            System.out.println("Le déplacement ne peut dépasser "+deplacementMaximal+". Pas de déplacement");
            return;
        }

        this.y += this.vitesse;
    }
}
