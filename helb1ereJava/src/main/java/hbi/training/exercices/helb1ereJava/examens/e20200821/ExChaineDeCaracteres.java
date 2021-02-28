package hbi.training.exercices.helb1ereJava.examens.e20200821;

import java.util.Locale;
import java.util.Scanner;

public class ExChaineDeCaracteres {

    public static void main(String[] args) {
        /* 
        a. System.out.print
        b. System.out.println
        c. charAt
        d. indexOf
        e. length
        f. substring
        g. compareTo
        h. equals
        i. contains

        voyelles : aeiouy

         */


        // clavier
        Scanner clavier = new Scanner(System.in);
        clavier.useLocale(Locale.US);

        System.out.print("\nVeuillez saisir une chaine : ");
//        String chaine = clavier.nextLine();
        System.out.println("");
        String chaine = "yipayeaholibaboua";
//        String chaine = "prtghpkjl";
//        String chaine = "yiplmoddduua";
//        String chaine = "aalibabas";

        System.out.println("La chaîne de départ est '" + chaine + "'");


        // afficher les séries
        String serie = "";
        int serieNumero = 0;
        int longueurDeLaPlusGrandeSerie = 0;
        int longueurDeLaPlusPetiteSerie = 0;
        int nombreTotalDeVoyelles = 0;

        for (int i = 0; i < chaine.length(); i++) {

            if ("aeiouy".indexOf(chaine.charAt(i)) > -1) {
//            if ("aeiouy".contains(String.valueOf(chaine.charAt(i)))) {
                serie += chaine.charAt(i);
            } else {
                if (!serie.equals("")) {
                    serieNumero++;
                    System.out.println("série n°" + serieNumero + " : " + serie);
                    if (serie.length() > longueurDeLaPlusGrandeSerie) {
                        longueurDeLaPlusGrandeSerie = serie.length();
                    }
                    if (serie.length() < longueurDeLaPlusPetiteSerie || longueurDeLaPlusPetiteSerie == 0) {
                        longueurDeLaPlusPetiteSerie = serie.length();
                    }
                    nombreTotalDeVoyelles += serie.length();
                    serie = "";
                }
            }

        }

        if (!serie.equals("")) {
            serieNumero++;
            System.out.println("série n°" + serieNumero + " : " + serie + "\n");
            if (serie.length() > longueurDeLaPlusGrandeSerie) {
                longueurDeLaPlusGrandeSerie = serie.length();
            }
            if (serie.length() < longueurDeLaPlusPetiteSerie || longueurDeLaPlusPetiteSerie == 0) {
                longueurDeLaPlusPetiteSerie = serie.length();
            }
            nombreTotalDeVoyelles += serie.length();
            serie = "";
        }

        if (serieNumero == 0) {

            System.out.println("\nAucune voyelle n'a été trouvée dans la chaine '" + chaine + "'");

        } else {

            // afficher le total des séries
            System.out.println(serieNumero + " série(s) trouvée(s) !");

            // afficher la plus grande série
            System.out.println("La plus grande série = " + longueurDeLaPlusGrandeSerie + " voyelle(s)");

            // afficher la plus petite série
            System.out.println("La plus petite série = " + longueurDeLaPlusPetiteSerie + " voyelle(s)");

            // afficher la quantité de voyelle dans la chaine (ATTENTION à la division par zéro !
            System.out.println("Il y a " + (100 / (double) chaine.length() * (double) nombreTotalDeVoyelles) + "% de voyelles dans la chaine de départ");

            // la voyelle la plus utilisée ???

            char voyelleLaPlusUtilisée = '0';
            int voyelleLaPlusUtiliséeOccurrences = 0;
            for (int i = 0; i < "aeiouy".length(); i++) {
                char voyelle = "aeiouy".charAt(i);
                int cpt = 0;
                for (int j = 0; j < chaine.length(); j++) {
                    if (voyelle == chaine.charAt(j)) {
                        cpt++;
                    }
                }
                if (cpt > voyelleLaPlusUtiliséeOccurrences) {
                    voyelleLaPlusUtiliséeOccurrences = cpt;
                    voyelleLaPlusUtilisée = voyelle;
                }
            }
            System.out.println("La voyelle la plus utilisée est : '" + voyelleLaPlusUtilisée + "' avec " + voyelleLaPlusUtiliséeOccurrences + " occurrences");

        }
    }

}
