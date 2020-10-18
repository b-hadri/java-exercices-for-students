package hbi.training.exercices.helb1ereJava.td03;

import java.util.Locale;
import java.util.Scanner;

public class Exercice201NombresAudessousDe0 {

    public static void main(String[] args) {

        /*
        Analyse
            - demander une liste de valeurs entières dans l'intervalle [-100,100]
            - terminer l'introduction des valeurs par nombre > 100
            - calculer le nombre de valeur en dessous de 0
            - afficher ce nombre 
        */

        Scanner clavier = new Scanner(System.in);
        clavier.useLocale(Locale.US);

        int entree = 0;
        int nombreDeValeurPlusPetiteQue0 = 0;
        while (entree <= 100) {
            System.out.println("Entrez une valeur entière (> que 100 pour sortir du programme)");
            entree = clavier.nextInt();

            if (entree < -100) {
                System.out.println("Veuillez entrer une valeur dans l'intervalle -100 et 100 (> que 100 pour sortir du programme)");
            } else {
                if (entree < 0) {
                    nombreDeValeurPlusPetiteQue0++;
                }
            }
        }

        System.out.println("Nombre de valeurs en dessous de 0 (et >= -100): " + nombreDeValeurPlusPetiteQue0);

    }

}
