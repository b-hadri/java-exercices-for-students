package hbi.training.exercices.helb1ereJava.poo.intro;

public class RectangleTest {

    public static void main(String[] args) {

        Rectangle monRectangle = new Rectangle(5, 10);

        System.out.println("Rectangle: " + monRectangle.getLargeurEnCm() + " sur " + monRectangle.getLongueurEnCm());
        System.out.println("Périmetre: " + monRectangle.peremitre() + " cm");
        System.out.println("Surface: " + monRectangle.surface() + " cm2");
        System.out.println("Le volume du rectangle avec une hauteur de 3 cm: "
                + monRectangle.volumeAPartirDeLaHauteur(3) + " cm3");

    }

}
