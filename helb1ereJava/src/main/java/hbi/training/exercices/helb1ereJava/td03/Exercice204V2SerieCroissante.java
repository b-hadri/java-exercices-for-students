package hbi.training.exercices.helb1ereJava.td03;

import java.util.Scanner;

public class Exercice204V2SerieCroissante {

    public static void main(String[] args) {

        final int VALEUR_SENTINELLE = 0;

        Scanner clavier = new Scanner(System.in);

        boolean isCroissant = true;
        boolean isDecroissant = true;
        boolean isStrictementCroissant = true;
        boolean isStrictementDecroissant = true;
        boolean isTrie;

        int entree = -1;
        int entreePrecedente = -1;

        // ---

        System.out.println("\n\nIntroduire la série d'entiers positifs (0 pour arreter): ");
        while (estCeQueLUtilisateurVeutContinuer(entree, VALEUR_SENTINELLE)) {
            entree = clavier.nextInt();

            if (entree != VALEUR_SENTINELLE) {
                isCroissant = gererIsCroissant(isCroissant, entreePrecedente, entree);
                isStrictementCroissant = gererIsStrictementCroissant(isStrictementCroissant, entreePrecedente, entree);

                isDecroissant = gererIsDecroissant(isDecroissant, entreePrecedente, entree);
                isStrictementDecroissant = gererIsStrictementDecroissant(isStrictementDecroissant, entreePrecedente, entree);
            }

            entreePrecedente = entree;
        }

        isTrie = gererIsTrie(isCroissant, isDecroissant);

        afficherResultat(isCroissant, isDecroissant, isStrictementCroissant, isStrictementDecroissant, isTrie);
    }

    private static boolean estCeQueLUtilisateurVeutContinuer(int entree, int valeurSentinelle) {
        return (entree != valeurSentinelle);
    }

    private static boolean gererIsCroissant(boolean isCroissant, int entreePrecedente, int entree) {
        if (isCroissant && entreePrecedente != -1) {
            if (entreePrecedente > entree) {
                return false;
            }
        }
        return isCroissant;
    }

    private static boolean gererIsStrictementCroissant(boolean isStrictementCroissant, int entreePrecedente, int entree) {
        if (isStrictementCroissant && entreePrecedente != -1) {
            if (entreePrecedente >= entree) {
                return false;
            }
        }
        return isStrictementCroissant;
    }

    private static boolean gererIsDecroissant(boolean isDecroissant, int entreePrecedente, int entree) {
        if (isDecroissant && entreePrecedente != -1) {
            if (entreePrecedente < entree) {
                isDecroissant = false;
            }
        }
        return isDecroissant;
    }

    private static boolean gererIsStrictementDecroissant(boolean isStrictementDecroissant, int entreePrecedente, int entree) {
        if (isStrictementDecroissant && entreePrecedente != -1) {
            if (entreePrecedente <= entree) {
                isStrictementDecroissant = false;
            }
        }
        return isStrictementDecroissant;
    }

    private static boolean gererIsTrie(boolean isCroissant, boolean isDecroissant) {
        return isCroissant || isDecroissant;
    }

    private static void afficherResultat(boolean isCroissant, boolean isDecroissant, boolean isStrictementCroissant, boolean isStrictementDecroissant, boolean isTrie) {
        System.out.println("Croissant = " + isCroissant);
        System.out.println("Strictement croissant = " + isStrictementCroissant);
        System.out.println("Decroissant = " + isDecroissant);
        System.out.println("Strictement décroissant = " + isStrictementDecroissant);
        System.out.println("Trié = " + isTrie);
    }

}
