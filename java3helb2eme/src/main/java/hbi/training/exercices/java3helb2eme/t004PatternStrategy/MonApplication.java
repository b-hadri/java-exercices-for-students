package hbi.training.exercices.java3helb2eme.t004PatternStrategy;

import java.util.Scanner;

public class MonApplication {

    public static void main(String[] args) {

        // récupérer l'entrée de l'utilisateur
        int valeurEntree = demanderLEntree();

        // réaliser le traitement
        new LAlgoAExecuter().executer(valeurEntree);

    }

    private static int demanderLEntree() {
        Scanner clavier = new Scanner(System.in);

        System.out.println("------------------------");
        System.out.println("Veuillez entrer un code d'algorithme: (1, 2 ou 3)");
        int entrée = clavier.nextInt();

        return entrée;
    }

}
