package hbi.training.exercices.helb1ereJava.poo.exmagiccarteterrain;

import java.util.ArrayList;
import java.util.List;

public class Jeu {

    private int nbrDeCarteMax;
    List<Carte> cartes = new ArrayList<>();
    Carte [] cartesTableau = new Carte[10];

    public Jeu(int nbrDeCarteMax) {
        this.nbrDeCarteMax = nbrDeCarteMax;

        System.out.println("On change de main");
    }

    public void piocher(Carte c) {
        // valider la taille du tableau !
        cartes.add(c);
    }

    public void afficher() {

        this.cartes.forEach(c -> {
            c.afficher();
        });

    }
}
