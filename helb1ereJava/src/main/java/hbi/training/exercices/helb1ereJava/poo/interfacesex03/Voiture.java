package hbi.training.exercices.helb1ereJava.poo.interfacesex03;

public class Voiture extends MoyenDeTransport {


    public Voiture(int x, int y, int vitesse) {
        super(x, y, vitesse);
    }

    @Override
    public void deplacementEnX() {

        int vitesseMaximale = this.VITESSE_INITIALE * 10;
        int deplacementMaximal = 100;

        if (this.vitesse > vitesseMaximale) {
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

}
