package hbi.training.exercices.helb1ereJava.td04;

public class ExS0207MethodeAfficherUnTableau {

    public static void main(String[] args) {

        int[] tableau = new int[]{2, 5, 9, 12, 9};

        afficherUnTableau(tableau);

    }

    private static void afficherUnTableau(int[] tableau) {
        System.out.println("Le tableau est ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]);
            if (i != tableau.length - 1) { // l'affichage ne doit pas se terminer par une virgule
                System.out.print(", ");
            }
        }
        System.out.println("");
    }

}
