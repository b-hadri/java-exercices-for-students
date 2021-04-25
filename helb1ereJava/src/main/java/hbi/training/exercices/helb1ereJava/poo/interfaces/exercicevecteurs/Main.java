package hbi.training.exercices.helb1ereJava.poo.interfaces.exercicevecteurs;

/*

vecteur d'entiers

créer un vecteur > taille !!

methode affecter (x, index) (index commence à 0)

méthode acceder (index)

méthode remplir avec la même valeur (d)

méthode produitScalaireAvec (un autre vecteur)

 */


public class Main {

    public static void main(String[] args) {

        IVecteur v1 = new Tableau(3);
        IVecteur v2 = new Tableau(3);

        v1.affecterUneValeur(2, 0);
        v1.affecterUneValeur(6, 1);
        v1.affecterUneValeur(1, 2);

        v2.affecterLaMemeValeurATousLesElements(5);

        // ps = v1[0]*v2[0] + v1[1]*v2[1] + v1[2]*v2[2]

        System.out.println(v1.produitScalaireAvec(v2));

    }

}
