package hbi.training.exercices.helb1ereJava.poo.interfaces;

public class HommeImplementation implements IHomme {

    @Override
    public void manger() {
        System.out.println("Je suis un homme et je mange.");
        // ...
    }

    @Override
    public void marcher() {
        System.out.println("Je suis un homme et je marche.");
    }

}
