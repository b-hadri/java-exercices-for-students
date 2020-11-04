package hbi.training.exercices.helb1ereJava.td04;

public class AutoEvaEx01TriABulle {

    public static void main(String[] args) {

        int[] tableau = {2, 3, 0, -1, 2, 1};

        afficherLeTableau(tableau);
        tableau = trierLeTableau(tableau);
        afficherLeTableau(tableau);

    }

    private static int[] trierLeTableau(int[] tableau) {
        return triABulle(tableau);
    }

    private static int[] triABulle(int[] tableau) {
        // si le tableau est vide ou si sa taille est de 1, il n'est pas necessaire de le trier
        if (tableau.length == 0 || tableau.length == 1) {
            return tableau;
        }

        // tri a bulle
        // faire emerger ou pousser la plus grande valeur vers la droite
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

    private static void afficherLeTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + ", ");
        }
        System.out.println("");
    }

}
