package hbi.training.exercices.helb1ereJava.td04;

public class AutoEvaEx01TriABulle {

    public static void main(String[] args) {

        // ce programme accepte zéro dans les nombres positifs

        int[] tableau = {2, 3, 0, 2, 1};

        afficherLeTableau(tableau);
        tableau = trierLeTableau(tableau);
        afficherLeTableau(tableau);

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
        return triABulle(tableau);
    }

    private static int[] triABulle(int[] tableau) {
        if (tableau.length == 0) {
            return tableau;
        }

        // tri a bulle
        for (int i = tableau.length; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                if (tableau[j - 1] > tableau[j]) {
                    int tmp = tableau[j - 1];
                    tableau[j - 1] = tableau[j];
                    tableau[j] = tmp;
                }
            }
        }

        return tableau;
    }


    private static int[] triParSelection(int[] tableau) {
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
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + ", ");
        }
        System.out.println("");
    }

}
