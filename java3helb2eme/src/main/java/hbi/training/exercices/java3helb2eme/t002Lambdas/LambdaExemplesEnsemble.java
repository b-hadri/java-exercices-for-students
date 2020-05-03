package hbi.training.exercices.java3helb2eme.t002Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExemplesEnsemble {

    public static void main(String[] args) {

//        // liste de chaines de caractères
//        List<String> listeDeChaines = new ArrayList<>();
//        listeDeChaines.add("Mohamed");
//        listeDeChaines.add("Adam");
//        listeDeChaines.add("Saleh");
//        listeDeChaines.add("Nassim");
//        listeDeChaines.add("Amar");
//
//        // trier sur le nombre de caractères, du plus petit au plus grand
//        Collections.sort(listeDeChaines, (ch1, ch2) -> (ch1.length() - ch2.length()));
//
//        // l'afficher à l'écran
//        listeDeChaines.forEach(s -> System.out.println(" --- " + s));

        preDisplay("monText", new ClassAbstract() {
            @Override
            public void display(String txt) {
                System.out.println(" *** " + txt);
            }
        });

//        preDisplay("monText2", s -> System.out.println(" *** " + s));

    }

    public static void preDisplay(String txt, ClassAbstract ca) {
        ca.display(txt);
    }

}

abstract class ClassAbstract {

    public abstract void display(String txt);

}