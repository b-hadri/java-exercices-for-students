package hbi.training.exercices.helb1ereJava.td03;

import java.util.Locale;
import java.util.Scanner;

public class Exercice11RacinesCarrees {

    public static void main(String[] args) {

        /*
        Écrire un programme java qui calcule les racines carrées de nombres fournis en donnée.
        Il s’arrêtera lorsqu’on lui fournira la valeur 0. Il refusera les valeurs négatives.
        */

        Scanner clavier = new Scanner(System.in);
        clavier.useLocale(Locale.US);

        int entier = 1;

        while (entier != 0) {

            System.out.println("\n> Donnez un nombre positif : ");
            entier = clavier.nextInt();

            if (entier < 0) {
                System.out.println("> SVP, un nombre positif ! ");
            } else {
                if (entier > 0)
                    System.out.println("> Sa racine carrée est : " + Math.sqrt(entier));
            }

        }

        System.out.println("> A bientôt");

    }

}
