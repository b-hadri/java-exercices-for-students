package hbi.training.exercices.helb1ereJava.poo.exsnakegame;

import java.util.LinkedList;

public class Serpent implements GrilleElement {

    private int longueur;
    private Direction direction = Direction.DROITE;
    private LinkedList<Position> positions;

    public Serpent(LinkedList<Position> positions) {
        this.positions = positions;
        this.longueur = positions.size();
    }

    @Override
    public String toString() {
        return "Serpent{" +
                "longueur=" + longueur +
                ", direction=" + direction +
                ", positions=" + positions +
                '}';
    }

    public boolean verifierSiExisteDansLaListeDesPositions(Position position) {
        return this.positions.contains(position);
    }

    public boolean verifierSiTete(Position position) {
        return this.positions.getFirst().equals(position);
    }

    @Override
    public char getPresentationCorp() {
        return 'x';
    }

    @Override
    public char getPresentationTete() {
        return 'X';
    }

    public int getLongueur() {
        return this.longueur;
    }

    public void avancer() {
        if (this.direction == Direction.DROITE) {
            // à faire, vérifier les demi-tours...
            Position teteDuSerpent = this.positions.getFirst();
            Position nouvellePosition =
                    new Position(teteDuSerpent.getLigne(), teteDuSerpent.getColonne() + 1);
            this.positions.addFirst(nouvellePosition); // ajouter un element avant la tête
            this.positions.removeLast(); // supprimer le dernier element
        } else if (this.direction == Direction.GAUCHE) {
            // attention au demi-tour
        } else if (this.direction == Direction.HAUT) {

        } else if (this.direction == Direction.BAS) {

        }
    }

    // plus tard, si j'ai besoin d'autres méthode

}
