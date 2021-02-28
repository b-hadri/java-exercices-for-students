package hbi.training.exercices.helb1ereJava.examens.e20200605_1_2_partie4;

public class Ex01 {

    public static void main(String[] args) {

        // exercice réalisé par les élèves directement


        int N = 10;
        Element tete = genererList(N);
        afficherList(tete);
        
    }

    private static void afficherList(Element tete) {
        String out = "";
        Element iterator = tete;
        while (iterator != null) {
            out += iterator.value + ", ";
            iterator = iterator.suivant;
        }
        System.out.println(out);
    }

    private static Element genererList(int nombreElements) {
        if (nombreElements == 0) {
            return null;
        }
        Element tete = new Element(randomEntierPairEntreMoins30etMoins10Ou10et30(), null);
        Element last = tete;

        for (int i = 1; i < nombreElements; i++) {
            // compris -30 et -10 ou 10 et 30
            // insérer par deux


            last.suivant = new Element(randomEntierPairEntreMoins30etMoins10Ou10et30(), null);
            last = last.suivant;
        }

        return tete;
    }

    public static int randomEntierPairEntre10et30() {
        int entier = (int) (Math.random() * 31);
        if (entier < 10) entier += 10;
        if (entier % 2 != 0) entier++;
        return entier;
    }

    public static int randomEntierPairEntreMoins30etMoins10Ou10et30() {
        int entier = (int) (Math.random() * 31);
        if (entier < 10) entier += 10;

        // gérer le random negatif / positif
        int negatif = (int) (Math.random() * 31);
        if (negatif % 2 == 0) entier = entier * -1;

        return entier;
    }

}

class Element {
    int value;
    Element suivant;

    public Element(int value, Element suivant) {
        this.value = value;
        this.suivant = suivant;
    }
}
