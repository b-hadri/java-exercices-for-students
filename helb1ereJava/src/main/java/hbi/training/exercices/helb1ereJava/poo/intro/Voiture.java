package hbi.training.exercices.helb1ereJava.poo.intro;

public class Voiture {

    static int lastId = 0;

    int id;
    String marque;
    String vitesse;
    String puissance;

    public Voiture(String marque, String vitesse, String puissance) {
        lastId++;
        this.id = lastId;
        this.marque = marque;
        this.vitesse = vitesse;
        this.puissance = puissance;
    }

    public String getDescription() {
        return "Voiture{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", vitesse='" + vitesse + '\'' +
                ", uissance='" + puissance + '\'' +
                '}';
    }
}
