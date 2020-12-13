package hbi.training.exercices.helb1ereJava.examens.janvier20180115;

// Exercice 1 de 2018 01 15 UE 1.2 - examen programmation 1 - Exam Tableau + liste chainee
// non complet

public class Exercice1 {
    public static void main(String[] args) {

        remplirTableauEtAfficher(7, 9);

    }

    private static int randomEntierImpair() {
        int entier = (int) (Math.random() * 10);
        if (entier % 2 == 0) return randomEntierImpair();
        else return entier;
    }

    private static void remplirTableauEtAfficher(int nombreDeLignes, int nombreDeColonnes) {
        int[][] tableau = remplirTableau(nombreDeLignes, nombreDeColonnes);
        afficherTableau(tableau);
    }

    private static int[][] remplirTableau(int nombreDeLignes, int nombreDeColonnes) {
        int[][] tableau = new int[nombreDeLignes][nombreDeColonnes];
        int colonneCentrale = nombreDeColonnes / 2;

        for (int ligne = 0; ligne < nombreDeLignes; ligne++) {
            for (int colonne = 0; colonne < nombreDeColonnes; colonne++) {
                if (ligne == 1 && colonne == 0) {
                    System.out.println("-----");
                }
                if (ligne == 0) { // 1er ligne
                    tableau[ligne][colonne] = randomEntierImpair();
                } else {
                    if (colonne == colonneCentrale) {
                        tableau[ligne][colonne] = randomEntierImpair();
                    } else {
                        if (colonne < colonneCentrale) {
                            tableau[ligne][colonne] = tableau[ligne - 1][colonne] + tableau[ligne][colonne + 1];
                        } else {
                            tableau[ligne][colonne] = tableau[ligne - 1][colonne] + tableau[ligne][colonne - 1];
                        }
                    }
                }
            }
        }

        return tableau;
    }

    private static void afficherTableau(int[][] tableau) {
        String out = "";
        for (int ligne = 0; ligne < tableau.length; ligne++) {
            for (int colonne = 0; colonne < tableau[0].length; colonne++) {
                out += tableau[ligne][colonne] + "\t";
            }
            out += "\n";
        }
        System.out.println(out);
    }

}
