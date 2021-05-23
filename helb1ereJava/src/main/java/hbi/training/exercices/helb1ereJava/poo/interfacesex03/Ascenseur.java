package hbi.training.exercices.helb1ereJava.poo.interfacesex03;

public class Ascenseur extends MoyenDeTransport {

    public Ascenseur(int x, int y, int vitesse) {
        super(x, y, vitesse);
    }

    @Override
    public void deplacementEnY() {

        int vitesseMaximale = this.VITESSE_INITIALE * 5;
        int deplacementMaximal = 50;

        if (this.vitesse > vitesseMaximale) {
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
