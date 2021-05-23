package hbi.training.exercices.helb1ereJava.poo.exsnakegame;

public interface GrilleElement {

    boolean verifierSiExisteDansLaListeDesPositions(Position position);
    boolean verifierSiTete(Position position);
    char getPresentationCorp(); // x
    char getPresentationTete(); // X

}
