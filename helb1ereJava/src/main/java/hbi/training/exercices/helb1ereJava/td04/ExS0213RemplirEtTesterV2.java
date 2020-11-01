package hbi.training.exercices.helb1ereJava.td04;

import java.util.Arrays;
import java.util.Random;

public class ExS0213RemplirEtTesterV2 {

    public static void main(String[] args) {

        int TAILLE_DU_TABLEAU = 5;
        int VALEUR_MAX_D_UN_ELEMENT_DU_TABLEAU = 20;

        // ---

        int[] t1;
        int[] t2 = new int[0];
        int compteurTentatives = 0;

        t1 = remplirTableauAvecDesValeursAleatoires(TAILLE_DU_TABLEAU, VALEUR_MAX_D_UN_ELEMENT_DU_TABLEAU);

        while (testContenu(t1, t2) == 0) { // tant que c'est faux, tant que les tableaux sont différents

            compteurTentatives++;
            t2 = remplirTableauAvecDesValeursAleatoires(TAILLE_DU_TABLEAU, VALEUR_MAX_D_UN_ELEMENT_DU_TABLEAU);

        }

        afficherResultat(t2, compteurTentatives);
    }

    private static int[] remplirTableauAvecDesValeursAleatoires(int tailleDuTableau, int valeurMaxDuneValeur) {
        Random random = new Random();
        int[] tableau = new int[tailleDuTableau];

        for (int i = 0; i < tailleDuTableau; i++) {
            tableau[i] = random.nextInt(valeurMaxDuneValeur);
        }

        return tableau;
    }

    // 1 = tableaux égaux / 0 = différents
    private static int testContenu(int[] t1, int[] t2) {

        if (t1.length != t2.length) {
            return 0;
        }

        for (int i = 0; i < t1.length; i++) {

            boolean elementTrouveT1surT2 = false;
            boolean elementTrouveT2surT1 = false;

            for (int j = 0; j < t2.length; j++) {
                if (t1[i] == t2[j]) { // trouvé ?
                    elementTrouveT1surT2 = true;
                }

                if (t2[i] == t1[j]) {
                    elementTrouveT2surT1 = true;
                }
            }

            if (!elementTrouveT1surT2 || !elementTrouveT2surT1) {
                return 0;
            }
        }

        return 1;
    }

    private static void afficherResultat(int[] t2, int compteurTentatives) {
        afficherTableau(t2);
        afficherLeNombreDeTentatives(compteurTentatives);
    }

    private static void afficherTableau(int[] t2) {
        System.out.println(Arrays.toString(t2));
    }

    private static void afficherLeNombreDeTentatives(int compteurTentatives) {
        System.out.println("Le nombre de tentatives est " + compteurTentatives);
    }

}
