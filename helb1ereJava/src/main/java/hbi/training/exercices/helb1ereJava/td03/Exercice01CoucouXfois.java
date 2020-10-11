package hbi.training.exercices.helb1ereJava.td03;

import java.util.Locale;
import java.util.Scanner;

public class Exercice01CoucouXfois {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        clavier.useLocale(Locale.US);

        System.out.println("\n> Combien de fois voulez-vous afficher 'coucou'?");
        int nTimes = clavier.nextInt();
        System.out.println(repeatStrNTimes("coucou", nTimes));

    }

    public static String repeatStrNTimes(String str, int nTimes) {
        String result = "";
        for (int i = 0; i < nTimes; i++) {
            result += str + "\n";
        }
        return result;

    }
}
