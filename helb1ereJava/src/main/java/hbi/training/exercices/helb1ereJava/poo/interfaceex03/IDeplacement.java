package hbi.training.exercices.helb1ereJava.poo.interfaceex03;

public interface IDeplacement {

    // méthode d'interface avec méthode par défaut
    default void deplacementEnX() {
        System.out.println("Aucun déplacement défini");
    }

    default void deplacementEnY() {
        System.out.println("Aucun déplacement défini");
    }

    void seDeplacer();

}
