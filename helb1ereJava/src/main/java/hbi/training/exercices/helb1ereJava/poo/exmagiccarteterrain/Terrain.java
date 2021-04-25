package hbi.training.exercices.helb1ereJava.poo.exmagiccarteterrain;

public class Terrain extends Carte {

    private char couleur;

    public Terrain(char couleur) {
        super(0);
        this.couleur = couleur;

        System.out.println("Un nouveau terrain.");
    }

    @Override
    public void afficher() {
        System.out.println("Un terrain "+getCouleurName());
    }

    private String getCouleurName() {

        switch (this.couleur) {
            case 'b':
                return "bleu";
            case 'B':
                return "blanc";
            // ...
        }

        return "couleur non trouvée";

    }
}
