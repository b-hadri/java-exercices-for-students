package hbi.training.exercices.helb1ereJava.td03;

public class Exercice19ProduitDesEntiersImpairs {

    public static void main(String[] args) {

        /*
        Écrire un programme qui calcule et affiche le produit des entiers impairs de 1 à 15.
         */

        int totalProduit = 1;

        for (int i = 1; i <= 15 ; i++) {

            if (i % 2 == 1) {
                totalProduit = totalProduit * i;
            }

        }

        System.out.println("\n > Le produit des entiers impairs de 1 à 15 est égal à " + totalProduit);

    }

}
