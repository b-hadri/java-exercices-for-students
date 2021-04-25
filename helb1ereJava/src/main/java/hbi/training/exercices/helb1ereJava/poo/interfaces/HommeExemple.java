package hbi.training.exercices.helb1ereJava.poo.interfaces;

public class HommeExemple {

    private IHomme homme;

    public HommeExemple(IHomme homme) {
        this.homme = homme;
    }

    public void afficherDescriptionDeLHomme() {
        this.homme.manger();
        this.homme.marcher();
    }

}
