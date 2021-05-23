package hbi.training.exercices.helb1ereJava.poo.interfacesex03;

public interface IDeplacement {

    // méthode d'interface avec méthode vide par défaut (aucun déplacement)
    default void deplacementEnX() { }

    default void deplacementEnY() { }

    void seDeplacer();

}
