package hbi.training.exercices.java3helb2eme.t002Lambdas;

import java.util.*;
import java.util.function.Consumer;

public class LambdaExemples02 {

    public static void main(String[] args) {

        List<Integer> mumbers = Arrays.asList(1, 3, 5, 2, 4);

        for (Integer n : mumbers) {
            // effet de bord, on modifie directement la variable contenue dans la liste!
            n *= 2;
        }

        // Ne fonctionne pas
//        for (Integer n : mumbers) {
//            if (n >= 2) {
//                // cette instruction pose de grands problèmes (concurrence, reference à null, iterateur...)
//                mumbers.remove(n);
//            }
//        }

        // Ne fonctionne toujours pas => UnsupportedOperationException
//        for (int i = 0; i < mumbers.size(); i++) {
//            if (mumbers.get(i) >= 2) {
//                mumbers.remove(i);
//            }
//        }

        // troisième méthode, créer une autre liste vide et ensuite l'assigner à number
//        List<Integer> filtered = new ArrayList<>();


        System.out.println(mumbers);

    }

}
