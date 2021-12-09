package hbi.training.exercices.helb1ereJava.y2021_2022.Q1_interro.Q1ChaineTD02;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrez une chaîne de caractères: (puis ENTER)");
        String ch =clavier.nextLine();

        System.out.println("Entrez un caractère: (puis ENTER)");
        char c = clavier.next().toLowerCase().charAt(0);

        int numberOfC = 0;
        for (int i = 0; i < ch.length(); i++) {
            char iC = ch.toLowerCase().charAt(i);
            if (iC == c) {
                numberOfC++;
            }
        }

        System.out.println("Il y a "+numberOfC+" occurences de '"+c+"' dans \""+ch);

    }

}
