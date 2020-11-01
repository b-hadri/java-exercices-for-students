package hbi.training.exercices.helb1ereJava.td04;

public class ExS0212MemesElementsNonOrdonnes {

    public static void main(String[] args) {

        // VRAI
//        int[] t1 = {1, 2, 3}; // i
//        int[] t2 = {1, 2, 3}; // i

//        int[] t1 = {3, 2, 1};
//        int[] t2 = {1, 2, 3};

        // FAUX
//        int[] t1 = {1, 5, 3};
//        int[] t2 = {1, 2, 3};

//        int[] t1 = {3};
//        int[] t2 = {3, 3, 3};

        int[] t1 = {1, 3, 3};
        int[] t2 = {1, 2, 3};

        if (testContenuV2(t1, t2) == 1) {
            System.out.println("VRAI");
        } else {
            System.out.println("FAUX");
        }

    }

    private static int testContenuV2(int[] t1, int[] t2) {

        if (t1.length != t2.length) {
            return 0;
        }

        // parcourir le tableau T1, élément par élément
        for (int i = 0; i < t1.length; i++) {

            boolean elementTrouveT1surT2 = false;
            boolean elementTrouveT2surT1 = false;

            // parcourir T2, vérifier que l'élément référencé par l'index "i" est égal au moins une seule fois dans T2
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

    private static int testContenuV1(int[] t1, int[] t2) {

        if (t1.length != t2.length) {
            return 0;
        }

        // parcourir le tableau T1, élément par élément
        for (int i = 0; i < t1.length; i++) {
            boolean elementTrouve = false;
            // parcourir T2, vérifier que l'élément référencé par l'index "i" est égal au moins une seule fois dans T2
            for (int j = 0; j < t2.length; j++) {
                if (t1[i] == t2[j]) { // trouvé ?
                    elementTrouve = true;
                }
            }
            if (!elementTrouve) {
                return 0;
            }
        }

        for (int i = 0; i < t2.length; i++) {
            boolean elementTrouve = false;
            for (int j = 0; j < t1.length; j++) {
                if (t2[i] == t1[j]) {
                    elementTrouve = true;
                }
            }
            if (!elementTrouve) {
                return 0;
            }
        }

        return 1;
    }

}
