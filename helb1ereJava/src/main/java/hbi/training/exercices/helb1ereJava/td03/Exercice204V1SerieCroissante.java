package hbi.training.exercices.helb1ereJava.td03;

import java.util.Scanner;

public class Exercice204V1SerieCroissante {

    public static void main(String[] args) {

        /*
        Les cas suivants NE SONT PAS gérés par ce programme : (essayez de l'améliorer en les ajoutant :)
           - la série qui contient un seul nombre
           - la série qui contient aucun nombre
           - la série qui contient que des nombres égales ie: 2, 2, 2, 2
         */

        Scanner clavier = new Scanner(System.in);

        boolean isCroissant = true;
        boolean isDecroissant = true;
        boolean isStrictementCroissant = true;
        boolean isStrictementDecroissant = true;
        boolean isTrie;

        int entree;
        int entreePrecedente = -1;

        System.out.println("Introduire la série d'entiers positifs : ");
        do {
            entree = clavier.nextInt();

            if (entree == 0) break; // TODO: améliorer la gestion du 0 (sentinnelle)

            if (isCroissant && entreePrecedente != -1) {
                if (entreePrecedente > entree) {
                    isCroissant = false;
                }
            }

            if (isStrictementCroissant && entreePrecedente != -1) {
                if (entreePrecedente >= entree) {
                    isStrictementCroissant = false;
                }
            }

            if (isDecroissant && entreePrecedente != -1) {
                if (entreePrecedente < entree) {
                    isDecroissant = false;
                }
            }

            if (isStrictementDecroissant && entreePrecedente != -1) {
                if (entreePrecedente <= entree) {
                    isStrictementDecroissant = false;
                }
            }

            entreePrecedente = entree;
        } while (entree != 0);

        isTrie = (isCroissant || isDecroissant);

        System.out.println("Croissant = " + isCroissant);
        System.out.println("Strictement croissant = " + isStrictementCroissant);
        System.out.println("Decroissant = " + isDecroissant);
        System.out.println("Strictement décroissant = " + isStrictementDecroissant);
        System.out.println("Trié = " + isTrie);
    }

}
