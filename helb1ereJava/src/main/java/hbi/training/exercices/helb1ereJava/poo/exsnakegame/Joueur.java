package hbi.training.exercices.helb1ereJava.poo.exsnakegame;

public class Joueur {
    private String name;

    public Joueur(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Joueur: "+ this.name;
    }
}
