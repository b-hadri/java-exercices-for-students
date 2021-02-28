package hbi.training.exercices.helb1ereJava.examens.e20180115;

// Exercice 1 de 2018 01 15 UE 1.2 - examen programmation 1 - Exam Tableau + liste chainee
// non complet

public class Exercice1 {
    public static void main(String[] args) {

        remplirTableauEtAfficher(7, 9);

    }

    private static int randomEntierImpair() {
        int entier = (int) (Math.random() * 10);
        if (entier % 2 == 0) entier++;
        return entier;
    }

    private static void remplirTableauEtAfficher(int nombreDeLignes, int nombreDeColonnes) {
        int[][] tableau = remplirTableau(nombreDeLignes, nombreDeColonnes);
        afficherTableau(tableau);
    }

    private static int[][] remplirTableau(int nombreDeLignes, int nombreDeColonnes) {
        int[][] tableau = new int[nombreDeLignes][nombreDeColonnes];
        int colonneCentrale = (nombreDeColonnes / 2);
        System.out.println("nombreDeColonnes = " + nombreDeColonnes);
        System.out.println("colonneCentrale = " + colonneCentrale);

        initialiserLa1erColonneEtLaCentrale(tableau, nombreDeLignes, nombreDeColonnes, colonneCentrale);

        initialiserEtCalculerPartieDroite(tableau, nombreDeLignes, nombreDeColonnes, colonneCentrale);
        initialiserEtCalculerPartieGauche(tableau, nombreDeLignes, nombreDeColonnes, colonneCentrale);

        return tableau;
    }

    private static void initialiserEtCalculerPartieGauche(int[][] tableau, int nombreDeLignes, int nombreDeColonnes, int colonneCentrale) {
        for (int ligne = 1; ligne < nombreDeLignes; ligne++) {
            for (int colonne = colonneCentrale - 1; colonne < nombreDeColonnes; colonne--) {
//                tableau[ligne][colonne] = tableau[ligne - 1][colonne] + tableau[ligne][colonne - 1];
                tableau[ligne][colonne] = tableau[ligne - 1][colonne] + tableau[ligne][colonne + 1];
            }
        }
    }

    private static void initialiserEtCalculerPartieDroite(int[][] tableau, int nombreDeLignes, int nombreDeColonnes, int colonneCentrale) {
        for (int ligne = 1; ligne < nombreDeLignes; ligne++) {
            for (int colonne = colonneCentrale + 1; colonne < nombreDeColonnes; colonne++) {
                tableau[ligne][colonne] = tableau[ligne - 1][colonne] + tableau[ligne][colonne - 1];
//                    tableau[ligne][colonne] = tableau[ligne - 1][colonne] + tableau[ligne][colonne + 1];
            }
        }
    }

    private static void initialiserLa1erColonneEtLaCentrale(int[][] tableau, int nombreDeLignes, int nombreDeColonnes, int colonneCentrale) {
        for (int ligne = 0; ligne < nombreDeLignes; ligne++) {
            for (int colonne = 0; colonne < nombreDeColonnes; colonne++) {
                if (ligne == 0) { // 1er ligne
                    tableau[ligne][colonne] = randomEntierImpair();
                } else {
                    if (colonne == colonneCentrale) {
                        tableau[ligne][colonne] = randomEntierImpair();
                    }
                }
            }
        }
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
