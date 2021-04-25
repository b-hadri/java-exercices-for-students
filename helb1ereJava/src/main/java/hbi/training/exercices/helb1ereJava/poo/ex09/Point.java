package hbi.training.exercices.helb1ereJava.poo.ex09;

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

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }

    public void translater(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void afficher() {
        System.out.println("(" + x + "," + y + ")");
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
