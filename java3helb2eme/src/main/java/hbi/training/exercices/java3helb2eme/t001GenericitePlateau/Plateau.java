package hbi.training.exercices.java3helb2eme.t001GenericitePlateau;

import java.util.List;

public class Plateau<T> {


    T[][] grille;

    public Plateau(T[][] grille) {
        this.grille = grille;
    }

    public T getIfExists(int ligne, int colonne) {
        return this.grille[ligne][colonne];
    }

    public void setOnGrille(int ligne, int colonne, T value) {
        this.grille[ligne][colonne] = value;
    }


}
