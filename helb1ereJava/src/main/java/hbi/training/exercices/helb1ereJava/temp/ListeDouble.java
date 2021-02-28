package hbi.training.exercices.helb1ereJava.temp;

public class ListeDouble {

    public static Element tete = null; // <========================================================== LISTE
    public static Element queue = null; // <========================================================== LISTE

    public static void main(String[] args) {

        // ajouter l'élément 3

        Element nouveauElement = new Element();
        nouveauElement.valeur = 3;

        tete = nouveauElement;
        queue = nouveauElement;

        // si (tete == queue) alors la liste se compose d'un seul élèment
        // OU la liste est vide


        // ajouter l'élément 7

        Element nouveauElement2 = new Element();
        nouveauElement2.valeur = 7;

        tete.suivant = nouveauElement2;
        queue = nouveauElement2;
        queue.precedent = tete;

        afficherLaListeDepuisLaFin(queue);
        System.out.println("");
        afficherLaListeDepuisLeDebut(tete);


    }

    private static void afficherLaListeDepuisLaFin(Element queue) {
        if (queue == null) {
            System.out.println("La liste est vide");
        } else {
            Element iterator = queue;
            while (iterator != null) {
                System.out.print(iterator.valeur + " > ");
                iterator = iterator.precedent;
            }
        }
    }

    private static void afficherLaListeDepuisLeDebut(Element tete) {
        if (tete == null) {
            System.out.println("La liste est vide");
        } else {
            Element iterator = tete;
            while (iterator != null) {
                System.out.print(iterator.valeur + " > ");
                iterator = iterator.suivant;
            }
        }
    }


}

class Element {
    public int valeur;
    public Element suivant;
    public Element precedent;
}

