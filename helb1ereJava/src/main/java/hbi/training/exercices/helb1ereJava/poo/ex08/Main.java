package hbi.training.exercices.helb1ereJava.poo.ex08;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(2, 3);
        Point p2 = new Point(9, 6);
        Point p3 = new Point(4, 9);

        Segment s12 = new Segment(p1, p2);
        Segment s23 = new Segment(p2, p3);

        System.out.println("s12 = " + s12);
        System.out.println("s23 = " + s23);

        System.out.println("=> p2.translater(6, -8);");
        p2.translater(6, -8);

        System.out.println("s12 = " + s12);
        System.out.println("s23 = " + s23);

    }

}
