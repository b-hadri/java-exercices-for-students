package hbi.training.exercices.java3helb2eme.ex005Canard;

public abstract class FabriqueCanard {

    public static Canard createCanard(String typeCanard) {
        if (typeCanard.equals("COLVERT")) {
            return new Colvert(false);
        } else {
            return new Fuligule(false);
        }
    }

}
