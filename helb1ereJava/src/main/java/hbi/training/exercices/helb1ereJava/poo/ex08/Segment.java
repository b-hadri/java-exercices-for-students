package hbi.training.exercices.helb1ereJava.poo.ex08;

/*
un segment de droite (souvent abrégé en « segment ») est une portion
de droite délimitée par deux points, appelés extrémités du segment.
 */
public class Segment {

    private Point a;
    private Point b;

    public Segment(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "["+ a + "-" + b + "]";
    }
}
