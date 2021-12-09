package hbi.training.exercices.helb1ereJava.y2021_2022.Q1_interro.Q1ChaineTD02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrez une chaîne de caractères: (puis ENTER)");
        String s = clavier.nextLine();

        System.out.println("Entrez un caractère: (puis ENTER)");
        char c = clavier.next().toLowerCase().charAt(0);

        int premierIndexDeC = -1;
        // parcourir la chaine de gauche à droite
        for (int i = 0; i < s.length(); i++) {
            char iC = s.toLowerCase().charAt(i);
            if (iC == c && premierIndexDeC == -1) {
                premierIndexDeC = i;
            }
        }

        if (premierIndexDeC == -1) {
            System.out.println(-1 + ", occurence non trouvée");
        } else {
            System.out.println("L'index de l'occurence la plus GAUCHE de '" + c + "' dans \"" + s + "\" est " + premierIndexDeC);
        }

    }

}
