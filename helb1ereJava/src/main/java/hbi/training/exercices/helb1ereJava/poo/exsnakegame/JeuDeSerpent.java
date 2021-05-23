package hbi.training.exercices.helb1ereJava.poo.exsnakegame;

public class JeuDeSerpent {

    private Joueur joueur;
    private Serpent serpent;
    private Grille grille;
//    private Liste<RegleDuJeu>...


    public JeuDeSerpent(Joueur joueur, Serpent serpent, Grille grille) {
        this.joueur = joueur;
        this.serpent = serpent;
        this.grille = grille;
    }

    public void commencerLeJeu() {
        System.out.println("Le jeu commence");

        System.out.println(this.retournerLEtatDuJeu());

        serpent.avancer();
        System.out.println(this.retournerLEtatDuJeu());

        serpent.avancer();
        System.out.println(this.retournerLEtatDuJeu());

        serpent.avancer();
        System.out.println(this.retournerLEtatDuJeu());

        serpent.avancer();
        System.out.println(this.retournerLEtatDuJeu());

        serpent.avancer();
        System.out.println(this.retournerLEtatDuJeu());

        serpent.avancer();
        System.out.println(this.retournerLEtatDuJeu());

        serpent.avancer();
        System.out.println(this.retournerLEtatDuJeu());

        // serpent.tourner(direction);
        // serpent.avancer();
        // System.out.println(this.retournerLEtatDuJeu());

    }

    private String retournerLEtatDuJeu() {
        StringBuilder out = new StringBuilder();

        out.append("============================================" + "\n");
        out.append(this.joueur + "\n");
        out.append("La longueur du serpent: "+serpent.getLongueur() + "\n");
        out.append(this.grille.afficherLaGrilleAvec(this.serpent));

        return out.toString();
    }
}
