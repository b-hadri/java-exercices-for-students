package hbi.training.exercices.java3helb2eme.t001Genericite;

public class Position<T> {

    private T value;

    public Position(T value) {
        this.value = value;
    }

    public boolean estCeQueJaiUneValeur() {
        return (value == null) ? false : true;
    }

    // jfojezofjofj

}
