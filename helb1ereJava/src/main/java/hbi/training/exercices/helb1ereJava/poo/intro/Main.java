package hbi.training.exercices.helb1ereJava.poo.intro;

public class Main {

    public static void main(String[] args) {

        Voiture v1 = new Voiture("Kia", "250 km/h", "90CH");
        Voiture v2 = new Voiture("Audi", "240 km/h", "85 CH");

        System.out.println(v1.getDescription());
        System.out.println(v2.getDescription());

    }

}
