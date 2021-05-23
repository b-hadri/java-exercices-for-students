package hbi.training.exercices.helb1ereJava.poo.exsnakegame;

public class Arbre implements GrilleElement {
    @Override
    public boolean verifierSiExisteDansLaListeDesPositions(Position position) {
        return false;
    }

    @Override
    public boolean verifierSiTete(Position position) {
        return false;
    }

    @Override
    public char getPresentationCorp() {
        return 0;
    }

    @Override
    public char getPresentationTete() {
        return 0;
    }
}
