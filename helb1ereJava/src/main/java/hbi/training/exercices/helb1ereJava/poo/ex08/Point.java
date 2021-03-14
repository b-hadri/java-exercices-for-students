package hbi.training.exercices.helb1ereJava.poo.ex08;

/*
un point est le plus petit élément constitutif de l'espace géométrique,
c'est-à-dire un lieu au sein duquel on ne peut distinguer aucun autre lieu que lui-même.
 */
public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0,0);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y +")";
    }

    public void translater(double x, double y) {
        this.x += x;
        this.y += y;
    }

}
