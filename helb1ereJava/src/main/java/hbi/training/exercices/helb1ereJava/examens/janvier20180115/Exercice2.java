package hbi.training.exercices.helb1ereJava.examens.janvier20180115;

// Exercice 2 de 2018 01 15 UE 1.2 - examen programmation 1 - Exam Tableau + liste chainee
// non complet

public class Exercice2 {

    static Element tete = null;
    static Element queue = null;

    public static void main(String[] args) {

        int N = randomEntierEntre0Et30();

        for (int i = 0; i < N; i++) {

            int nombreAStocker = randomEntierEntreMoins30Et30();
            stockerNombreEntier(nombreAStocker);
            affichierLaListeDuDebut();

        }


//        stockerNombreEntier(17);
//        affichierLaListeDuDebut();
//        // == 17 (tete == queue)
//
//        stockerNombreEntier(-10);
//        affichierLaListeDuDebut();
//        // ==> -10 > 17
//
//        stockerNombreEntier(-15);
//        affichierLaListeDuDebut();
//        // ==> -10 > -15 > 17
//
//        stockerNombreEntier(8);
//        affichierLaListeDuDebut();
//        // ==> -10, -15, 17, 8
//
//        stockerNombreEntier(29);
//        affichierLaListeDuDebut();
//
//        stockerNombreEntier(-4);
//        affichierLaListeDuDebut();
//
//        stockerNombreEntier(-6);
//        affichierLaListeDuDebut();
//
//        stockerNombreEntier(0);
//        affichierLaListeDuDebut();
//
//        stockerNombreEntier(22);
//        affichierLaListeDuDebut();
//
//        stockerNombreEntier(-12);
//        affichierLaListeDuDebut();

    }

    private static void stockerNombreEntier(int nombre) {

        if (tete == null) {
            initialiserLePremierElementDeLaListe(nombre);
        } else if (nombre < 0 && nombre % 2 == 0) {
            ajouterAvantLaTete(nombre);
        } else if (nombre < 0 && Math.abs(nombre) % 2 != 0 && tete.suivant != null) {
            ajouterDirectementApresLaTete(nombre);
        } else {
            ajouterALaFin(nombre);
        }

    }

    private static void initialiserLePremierElementDeLaListe(int nombre) {
        Element newElement = new Element(nombre, null, null);
        tete = newElement;
        queue = newElement;
    }

    private static void ajouterALaFin(int nombre) {
        Element newElement = new Element(nombre, null, queue);
        queue.suivant = newElement;
        queue = newElement;
    }

    private static void ajouterDirectementApresLaTete(int nombre) {
        Element newElement = new Element(nombre, tete.suivant, tete);
        tete.suivant = newElement;
        newElement.suivant.precedent = newElement;
    }

    private static void ajouterAvantLaTete(int nombre) {
        Element newElement = new Element(nombre, tete, null);
        tete.precedent = newElement;
        tete = newElement;
    }

    private static void affichierLaListeDuDebut() {
        Element iterator = tete;

        if (tete == null) {
            System.out.println("La liste est vide");
        } else {
            String out = "";

            while (iterator != null) {
                out += iterator.value + "   ";
                iterator = iterator.suivant;
            }

            System.out.println(out);
        }

    }


    private static int randomEntierEntre0Et30() {
        return (int) (Math.random() * 31);
    }

    private static int randomEntierEntreMoins30Et30() {
        int entier = randomEntierEntre0Et30();
        if ((int) (Math.random() * 2) % 2 == 0) {
            entier = -1 * entier;
        }
        return entier;
    }

}

class Element {
    int value;
    Element suivant;
    Element precedent;

    public Element(int value, Element suivant, Element precedent) {
        this.value = value;
        this.suivant = suivant;
        this.precedent = precedent;
    }
}
