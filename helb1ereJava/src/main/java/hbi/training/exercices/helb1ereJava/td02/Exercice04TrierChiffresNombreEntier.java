package hbi.training.exercices.helb1ereJava.td02;

import java.util.Locale;
import java.util.Scanner;

public class Exercice04TrierChiffresNombreEntier {

    public static void main(String[] args) {

        // -------------------------------------------
        // sans utiliser d'itération !
        // -------------------------------------------

        Scanner clavier = new Scanner(System.in);
        clavier.useLocale(Locale.US);

        // instruction
        System.out.println("Entrez 3 entiers");
        System.out.print("A: ");
        int entier1 = clavier.nextInt();
        System.out.print("B: ");
        int entier2 = clavier.nextInt();
        System.out.print("C: ");
        int entier3 = clavier.nextInt();

        if (entier3 < entier2) {
            int tmp = entier3;
            entier3 = entier2;
            entier2 = tmp;
        }

        if (entier2 < entier1) {
            int tmp = entier2;
            entier2 = entier1;
            entier1 = tmp;
        }

        if (entier3 < entier2) {
            int tmp = entier3;
            entier3 = entier2;
            entier2 = tmp;
        }

        System.out.println("Les entiers triés sont : " + entier1 + " " + entier2 + " " + entier3);

    }

}
