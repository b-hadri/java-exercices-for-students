package hbi.training.exercices.helb1ereJava.poo.interfaces;

public class JeuneHommeExemple implements IHomme {

    @Override
    public void manger() {
        System.out.println("Je suis un jeune homme et je mange");
    }

    @Override
    public void marcher() {
        System.out.println("Je suis un jeune homme et je marche");
    }

}
