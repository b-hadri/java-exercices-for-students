package hbi.training.exercices.helb1ereJava.td04;

public class ExS0212MemesElementsNonOrdonnes2 {

    public static void main(String[] args) {

        // VRAI = 1
        int[] t1 = {1, 2, 3}; // i
        int[] t2 = {1, 2, 3}; // i

//        int[] t1 = {3, 2, 1};
//        int[] t2 = {1, 2, 3};

        // FAUX = 0
//        int[] t1 = {1, 5, 3};
//        int[] t2 = {1, 2, 3};

//        int[] t1 = {3};
//        int[] t2 = {3, 3, 3};

//        int[] t1 = {1, 3, 3};
//        int[] t2 = {2, 1, 3};

        if (testContenu(t1, t2) == 1) {
            System.out.println("VRAI");
        } else {
            System.out.println("FAUX");
        }
    }

    private static int testContenu(int[] t1, int[] t2) {

        // exactement les mêmes,
        if (t1.length != t2.length) {
            return 0;
        }

        // attention, n'est pas forcément dans l'ordre
        for (int i = 0; i < t1.length; i++) {

            int trouveeT1surT2 = 0;
            int trouveeT2surT1 = 0;

            for (int j = 0; j < t2.length; j++) {
                if (t1[i] == t2[j]) {
                    trouveeT1surT2 = 1;
                }
                if (t2[i] == t1[j]) {
                    trouveeT2surT1 = 1;
                }
            }

            if (trouveeT1surT2 == 0 || trouveeT2surT1 == 0) {
                return 0;
            }
        }

        return 1;
    }


}
