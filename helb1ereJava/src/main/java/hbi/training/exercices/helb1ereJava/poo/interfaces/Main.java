package hbi.training.exercices.helb1ereJava.poo.interfaces;

/*



 */

public class Main {

    public static void main(String[] args) {

        IHomme homme = new JeuneHommeExemple();

        HommeExemple hommeExemple = new HommeExemple(homme);
        hommeExemple.afficherDescriptionDeLHomme();
    }

}
