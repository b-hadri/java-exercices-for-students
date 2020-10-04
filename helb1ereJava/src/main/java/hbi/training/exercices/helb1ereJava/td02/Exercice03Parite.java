package hbi.training.exercices.helb1ereJava.td02;

import java.util.Locale;
import java.util.Scanner;

public class Exercice03Parite {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un entier: ");
        int entier = clavier.nextInt();

        String resultat = "";

        while (entier != 0) {

            int chiffre = entier % 10;

            if (chiffre % 2 == 0) {
                resultat = chiffre + " est pair\n" + resultat;
            } else {
                resultat = chiffre + " est impair\n" + resultat;
            }

            entier = entier / 10;
        }

        System.out.println(resultat);

    }

}
