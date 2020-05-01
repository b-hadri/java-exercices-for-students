package hbi.training.exercices.java3helb2eme.t001Genericite;

import java.util.ArrayList;

public class Exemple001 extends ArrayList{

    public static void main(String[] args) {

        Position<String> p = new Position<>(null);
        System.out.println(p.estCeQueJaiUneValeur());

        p = new Position<>("Ceci est un text");
        System.out.println(p.estCeQueJaiUneValeur());

        Position<ArrayList<Object>> p2 = new Position<>(new ArrayList<>());
        System.out.println(p.estCeQueJaiUneValeur());

    }

    public void display(double d) {

    }

    public void display(String d) {

    }

    @Override
    public boolean isEmpty() {
        // to propre code
        return super.isEmpty();
    }
}
