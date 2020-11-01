package hbi.training.exercices.helb1ereJava.td04;

import java.util.Arrays;
import java.util.Random;

public class ExS0213RemplirEtTesterV2 {

    public static void main(String[] args) {

        int TAILLE_DU_TABLEAU = 3;
        int VALEUR_MAX_D_UN_ELEMENT_DU_TABLEAU = 20;

        // ---

        int[] t1 = new int[TAILLE_DU_TABLEAU];
        int[] t2 = new int[TAILLE_DU_TABLEAU];

        t1 = remplirTableau(t1, VALEUR_MAX_D_UN_ELEMENT_DU_TABLEAU);

        int compteurTentatives = 0;

        while (testContenu(t1, t2) == 0) { // tant que c'est faux, tant que les tableaux sont différents
            compteurTentatives++;
            t2 = remplirTableau(t2, VALEUR_MAX_D_UN_ELEMENT_DU_TABLEAU);
        }

        afficherTableau(t2);
        afficherLeNombreDeTentatives(compteurTentatives);
    }


    private static int[] remplirTableau(int[] tableau, int valeurMaxDuneValeur) {
        Random random = new Random();

        for (int i = 0; i < tableau.length; i++) {
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

    private static void afficherTableau(int[] t2) {
        System.out.println(Arrays.toString(t2));
    }

    private static void afficherLeNombreDeTentatives(int compteurTentatives) {
        System.out.println("Le nombre de tentatives est " + compteurTentatives);
    }

}
