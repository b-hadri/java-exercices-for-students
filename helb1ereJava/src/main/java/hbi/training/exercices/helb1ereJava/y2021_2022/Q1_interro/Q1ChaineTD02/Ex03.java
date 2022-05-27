package hbi.training.exercices.helb1ereJava.y2021_2022.Q1_interro.Q1ChaineTD02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        int mFaces = 100;
        int [] jets = {1, 2, 2, 2, 5, 6, 6, 6, 100};

        // tableau
        // 1 -> 1
        // 2 -> 3
        // 5 -> 1

        // [Nbr. jets][2]

        int [] valeursEtOccurrences = new int[mFaces];

        for (int i = 0; i < jets.length; i++) {

            int laFace = jets[i]-1;
            valeursEtOccurrences[laFace] = valeursEtOccurrences[laFace] + 1;

        }

        System.out.println(Arrays.toString(valeursEtOccurrences));




        /*

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


         */

    }

}
