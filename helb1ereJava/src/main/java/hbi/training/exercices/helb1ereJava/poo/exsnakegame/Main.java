package hbi.training.exercices.helb1ereJava.poo.exsnakegame;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Joueur joueur = new Joueur("Adam");
        LinkedList<Position> positionsDuSerpent = new LinkedList<>();
        positionsDuSerpent.add(new Position(5, 6));
        positionsDuSerpent.add(new Position(5, 5));
        positionsDuSerpent.add(new Position(5, 4));

        Serpent serpent = new Serpent(positionsDuSerpent);

        Grille grille = new Grille(10, 10);

        // ---

        JeuDeSerpent jeu = new JeuDeSerpent(joueur, serpent, grille);

        jeu.commencerLeJeu();

    }

}
