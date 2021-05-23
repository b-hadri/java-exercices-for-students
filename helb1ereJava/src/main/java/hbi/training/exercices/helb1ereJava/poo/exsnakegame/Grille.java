package hbi.training.exercices.helb1ereJava.poo.exsnakegame;

public class Grille {

    private int nombreDeLignes;
    private int nombreDeColonnes;

    public Grille(int nombreDeLignes, int nombreDeColonnes) {
        this.nombreDeLignes = nombreDeLignes;
        this.nombreDeColonnes = nombreDeColonnes;
    }

    public String afficherLaGrille() {
        StringBuilder out = new StringBuilder();
        for (int ligne = 0; ligne < nombreDeLignes; ligne++) {
            for (int colonne = 0; colonne < nombreDeColonnes; colonne++) {
                out.append(".\t");
            }
            out.append("\n");
        }
        return out.toString();
    }

    public String afficherLaGrilleAvec(GrilleElement elmt) {
        StringBuilder out = new StringBuilder();
        for (int ligne = 0; ligne < nombreDeLignes; ligne++) {
            for (int colonne = 0; colonne < nombreDeColonnes; colonne++) {
                Position position = new Position(ligne, colonne);
                if (elmt.verifierSiExisteDansLaListeDesPositions(position)) {
                    if (elmt.verifierSiTete(position)) {
                        out.append(elmt.getPresentationTete() + "\t");
                    } else {
                        out.append(elmt.getPresentationCorp() + "\t");
                    }
                } else {
                    out.append(".\t");
                }
            }
            out.append("\n");
        }
        return out.toString();
    }
}
