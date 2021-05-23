package hbi.training.exercices.helb1ereJava.poo.interfacesex04;

public class Main {
    public static void main(String[] args) {

        Robot robotToMars = new Robot("ToMars");
        robotToMars.afficher();

        System.out.println("----------------");

        robotToMars.avance();
        robotToMars.afficher();

        robotToMars.droite();
        robotToMars.afficher();

        System.out.println("---");

        robotToMars.avance();
        robotToMars.afficher();

        robotToMars.droite();
        robotToMars.afficher();

        System.out.println("---");

        robotToMars.avance();
        robotToMars.afficher();

        robotToMars.droite();
        robotToMars.afficher();

        System.out.println("---");

        robotToMars.avance();
        robotToMars.afficher();

        robotToMars.droite();
        robotToMars.afficher();

    }
}
