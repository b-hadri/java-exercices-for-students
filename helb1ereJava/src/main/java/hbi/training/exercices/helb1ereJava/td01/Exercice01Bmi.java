package hbi.training.exercices.helb1ereJava.td01;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercice01Bmi {

    public static void main(String[] args) {

        // déclaration
        double poidsEnKg = 0.0;
        double tailleEnM = 0.0;
        double bmi = 0.0;

        Scanner clavier = new Scanner(System.in);
        clavier.useLocale(Locale.US);

        // instruction

        System.out.println("\n\n");

        poidsEnKg = getDoubleDeLUtilisateur("Saisir votre poids en Kg (utilisez le . comme séparateur) : ", clavier);
        tailleEnM = getDoubleDeLUtilisateur("Saisir votre taille en mètre(s)  (utilisez le . comme séparateur) : ", clavier);

        bmi = poidsEnKg / Math.pow(tailleEnM, 2.0);
        bmi = Math.round(bmi * 100.0) / 100.0;

        System.out.println("--- Votre BMI est de " + bmi + " ---");

        // TODO: gérer les entrées des utilisateurs et les valider (ex: caractères alphanumérique, le nombre 0 pour la taille)

    }

    public static double getDoubleDeLUtilisateur(String msg, Scanner clavier) {
        try {
            System.out.print(msg);
            double d = clavier.nextDouble();

            if (d == 0.0) {
                throw new Exception("0 n'est pas permis");
            }

            return d;
        } catch (InputMismatchException e) {
            System.out.println("Attention, veuillez entrer un nombre correct!");
            clavier.nextLine();
        } catch (Exception e) {
            System.out.println("Attention, le ZERO n'est pas permis!");
            clavier.nextLine();
        }

        return getDoubleDeLUtilisateur(msg, clavier);
    }

}
