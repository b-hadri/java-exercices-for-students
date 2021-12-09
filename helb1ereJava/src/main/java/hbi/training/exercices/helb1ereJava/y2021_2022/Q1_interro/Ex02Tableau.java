package hbi.training.exercices.helb1ereJava.y2021_2022.Q1_interro;

public class Ex02Tableau {

    public static void main(String[] args) {

        int [] tableauA = new int[20];
        remplirTableau(tableauA);
        afficherTableau(tableauA);

        int [] tableauB = trouverLeNombreDOccurenceDesIndices(tableauA);
        afficherTableau(tableauB);

        calculerEtAfficherLaSommeS(tableauA);


    }

    private static void calculerEtAfficherLaSommeS(int[] tableauA) {

    }

    private static int[] trouverLeNombreDOccurenceDesIndices(int[] tableau) {
        int [] nbrOccurencesDesIndices = new int[10];
        for (int i = 0; i < 10; i++) {
            int cpt = 0;
            for (int j = 0; j < tableau.length; j++) {
                if (i == tableau[j]) {
                    cpt++;
                }
            }
            nbrOccurencesDesIndices[i] = cpt;
        }
        return nbrOccurencesDesIndices;
    }

    public static int genererNbrAleatoire(int max) {
        return (int) (Math.random() * max);
    }

    public static void remplirTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = genererNbrAleatoire(9);
        }
    }

    public static void afficherTableau(int [] tableau) {
        String out = "";
        for(int i = 0; i < tableau.length; i++) {
            out += tableau[i]+ " | ";
        }
        System.out.println(out);
    }

}
