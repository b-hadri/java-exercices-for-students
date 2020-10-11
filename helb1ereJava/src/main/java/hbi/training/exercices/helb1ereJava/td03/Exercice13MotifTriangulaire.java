package hbi.training.exercices.helb1ereJava.td03;

import java.util.Locale;
import java.util.Scanner;

public class Exercice13MotifTriangulaire {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        clavier.useLocale(Locale.US);

        System.out.println("\n> Introduire le nombre de lignes du motif triangulaire : ");
        int nombreDeLignes = clavier.nextInt();

        String ligneDuMotif = "";
        for (int i = 0; i < nombreDeLignes; i++) {
            ligneDuMotif += "*";
            System.out.println(ligneDuMotif);
        }

    }

}
