package hbi.training.exercices.helb1ereJava.td04;

import java.util.Scanner;

public class ExS0204RechercherDansUnTableau {

    public static void main(String[] args) {

        // on définit un tableau manuellement
        int[] tableau = new int[]{2, 5, 9, 12, 9, 12, 2, 96, 55, 1, 1};

        afficherUnTableau(tableau);

        int entree = recupererUneEntree();

        int indexTrouve = rechercherValeurDansTableau(entree, tableau);

        afficherResultat(indexTrouve);

    }

    private static void afficherUnTableau(int[] tableau) {
        System.out.println("Le tableau est ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + ", ");
        }
        System.out.println("");
    }

    private static int recupererUneEntree() {
        int entree;
        Scanner clavier = new Scanner(System.in);
        System.out.println("\nRechercher un entier dans le tableau ci-dessus : ");
        entree = clavier.nextInt();
        return entree;
    }


    private static int rechercherValeurDansTableau(int entree, int[] tableau) {
        int indexTrouvé = -1;
        for (int i = 0; i < tableau.length; i++) {
            if (entree == tableau[i]) {
                indexTrouvé = i;
            }
        }
        return indexTrouvé;
    }

    private static void afficherResultat(int indexTrouvé) {
        if (indexTrouvé < 0) {
            System.out.println("Valeur non trouvée");
        } else {
            System.out.println("Valeur TROUVÉE ! L'index est " + indexTrouvé);
        }
    }

}
