package hbi.training.exercices.java3helb2eme.t001GenericitePlateau;

public class Application {

    public static void main(String[] args) {

        // Todo REFACTORING + CLEANING

        Fighter[][] grilleFighters = new Fighter[3][3];

        Plateau<Fighter> plateau = new Plateau<>(grilleFighters);

        plateau.setOnGrille(0, 0, new Fighter("Ruy"));
        plateau.setOnGrille(1, 1, new Fighter("Bison"));

        String out = "";

        // Todo REFACTORING + CLEANING

        for (int ligne = 0; ligne < 3; ligne++) {
            String uneLigneDisplay = "";
            for (int col = 0; col < 3; col++) {
                Fighter f = plateau.getIfExists(ligne, col);
                if (f != null) {
                    uneLigneDisplay += "F\t";
                } else {
                    uneLigneDisplay += ".\t";
                }
            }
            out += uneLigneDisplay + "\n";
        }

        System.out.println("-----------------------");
        System.out.println(out);
    }


}


class Fighter {
    private String nom;

    public Fighter(String nom) {
        this.nom = nom;
    }

    public void kick() {
        System.out.println("kiiiiiiiiiiiick");
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "nom='" + nom + '\'' +
                '}';
    }
}