package hbi.training.exercices.helb1ereJava.y2021_2022.Q1_interro.Q1ChaineTD02;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrez une chaîne de caractères: (puis ENTER)");
        String s = clavier.nextLine();

        System.out.println("Entrez un caractère: (puis ENTER)");
        char c = clavier.next().toLowerCase().charAt(0);

        int dernierIndexDeC = -1;
        // parcourir la chaîne de droite à gauche
        for (int i = s.length() - 1; i >=  0; i--) {
            char iC = s.toLowerCase().charAt(i);
            if (iC == c && dernierIndexDeC == -1) {
                dernierIndexDeC = i;
            }
        }

        if (dernierIndexDeC == -1) {
            System.out.println(-1 + ", occurence non trouvée");
        } else {
            System.out.println("L'index de l'occurence la plus DROITE de '" + c + "' dans \"" + s + "\" est " + dernierIndexDeC);
        }

    }

}
