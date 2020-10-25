package hbi.training.exercices.helb1ereJava.td04;

import java.util.Scanner;

public class Ex06TriParSelection {

    public static void main(String[] args) {

        // ce programme accepte zéro dans les nombres positifs

        int[] tableau = new int[0];

        System.out.println("\nIntroduire des entiers positifs, terminer par un nombre négatif : ");
        Scanner clavier = new Scanner(System.in);
        int entree;

        boolean continuerLEncodage = true;

        while (continuerLEncodage) {

            entree = clavier.nextInt();
            if (entree < 0) {
                continuerLEncodage = false;
                tableau = trierLeTableau(tableau);
                afficherLeTableau(tableau);
            } else {
                tableau = ajouterEntreeAuTableau(tableau, entree);
            }

        }

    }

    private static int[] ajouterEntreeAuTableau(int[] tableau, int entree) {
        int[] newTableau = new int[tableau.length + 1];

        // copier le tableau
        for (int i = 0; i < tableau.length; i++) {
            newTableau[i] = tableau[i];
        }

        // ajouter la nouvelle entrée
        newTableau[tableau.length] = entree;

        return newTableau;
    }

    private static int[] trierLeTableau(int[] tableau) {
        if (tableau.length == 0) {
            return tableau;
        }

        // tri par sélection
        for (int i = 0; i < (tableau.length - 1); i++) {
            int minIndex = i;
            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[minIndex] > tableau[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int tmp = tableau[minIndex];
                tableau[minIndex] = tableau[i];
                tableau[i] = tmp;
            }
        }

        return tableau;
    }

    private static void afficherLeTableau(int[] tableau) {
        System.out.println("Le tableau trié : ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + ", ");
        }
    }

}
