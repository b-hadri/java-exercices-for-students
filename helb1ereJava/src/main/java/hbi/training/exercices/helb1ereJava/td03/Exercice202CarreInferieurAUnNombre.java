package hbi.training.exercices.helb1ereJava.td03;

import java.util.Scanner;

public class Exercice202CarreInferieurAUnNombre {

    public static void main(String[] args) {

        /*
        Écrire un programme qui affiche les nombres entiers strictement positifs
        dont le carré est inférieur à un nombre entier introduit par l’utilisateur.

        Analyse
            - introduire un nombre entier
            - calculer le carré pour chaque nombre de 0 au nombre entier introduit
                - le résultat doit être inférieur au nombre entier introduit
            - afficher les nombres
        */

        Scanner clavier = new Scanner(System.in);
        System.out.println("Introduire un entier: ");
        int entree = clavier.nextInt();

        int i = 1;
        double resultatCarre;
        do {
            resultatCarre = Math.pow(i, 2);
            if (resultatCarre < entree) {
                System.out.println(". " + i);
            }
            i++;
        } while (resultatCarre < entree);


        System.out.println("Fin...");
    }

}
