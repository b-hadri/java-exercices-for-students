package hbi.training.exercices.java3helb2eme.t002Lambdas;

import java.util.*;
import java.util.function.Consumer;

public class LambdaExemples01 {

    public static void main(String[] args) {

        ecriture01();

    }

    private static void ecriture01() {

        List<String> listeDeChaines = new ArrayList<>();
        listeDeChaines.add("Mohamed");
        listeDeChaines.add("Adam");
        listeDeChaines.add("Noh");
        listeDeChaines.add("Houd");
        listeDeChaines.add("Salih");

        Collections.sort(listeDeChaines, new Comparator<String>() {
            @Override
            public int compare(String ch1, String ch2) {
                return (ch1.length() - ch2.length());
            }
        });

        listeDeChaines.forEach(new Consumer<String>() {
            @Override
            public void accept(String ch) {
                System.out.println(ch);
            }
        });

    }

    private static void ecriture02() {
        List<String> listeDeChaines = new ArrayList<>();
        listeDeChaines.add("Adam");
        listeDeChaines.add("Noh");
        listeDeChaines.add("Houd");
        listeDeChaines.add("Salih");

        Collections.sort(listeDeChaines, (ch1, ch2) -> {
            return (ch1.length() - ch2.length());
        });

        listeDeChaines.forEach(System.out::println);
    }

    private static void ecriture03() {
        List<String> listeDeChaines = new ArrayList<>();
        listeDeChaines.add("Adam");
        listeDeChaines.add("Noh");
        listeDeChaines.add("Houd");
        listeDeChaines.add("Salih");

        Collections.sort(listeDeChaines, (ch1, ch2) -> (ch1.length() - ch2.length()));

        listeDeChaines.forEach(System.out::println);
    }

    private static void ecriture04() {
        List<String> listeDeChaines = new ArrayList<>();
        listeDeChaines.add("Adam");
        listeDeChaines.add("Noh");
        listeDeChaines.add("Houd");
        listeDeChaines.add("Salih");

        Collections.sort(listeDeChaines, Comparator.comparingInt(String::length));

        listeDeChaines.forEach(System.out::println);
    }

}
