package examen.biblio;

import java.time.LocalDate;

// programme principal devra fournir le fichier out.txt
public class Program {

    public static void main(String[] args) {

        // encodage de 10 livres dont 2 de collection
        Bibliotheque bibliotheque = new Bibliotheque();
        bibliotheque.ajouterLivre(new LivreEmpruntable(
                "ROY B.",
                "Algèbre Moderne et Théorie des Graphes",
                "673-1394826973",
                "AS12"));
        bibliotheque.ajouterLivre(new LivreEmpruntable(
                "LEVY G.",
                "Algorithmique combinatoire",
                "762-0612625415",
                "AS30"));
        bibliotheque.ajouterLivre(new LivreEmpruntable(
                "Andrew Tanenbaum",
                "Réseaux",
                "316-1910384155",
                "PN43"));
        bibliotheque.ajouterLivre(new LivreEmpruntable(
                "J.P. Delahaye",
                "Outils logiques pour l'intelligence artificielle",
                "316-0918344482",
                "QA76"));
        bibliotheque.ajouterLivre(new LivreEmpruntable(
                "Liret-Martinais",
                "Analyse 1ère année",
                "763-6722556028",
                "QA77"));
        bibliotheque.ajouterLivre(new LivreEmpruntable(
                "DELANNOY C.",
                "Programmer en langage C",
                "478-2123602336",
                "SA64"));
        bibliotheque.ajouterLivre(new LivreEmpruntable(
                "FIEUX L.",
                "Le langage C",
                "444-1234563426",
                "TD6"));
        bibliotheque.ajouterLivre(new LivreEmpruntable(
                "J.-L. Hainaut",
                "Bases de données et modèles de calcul\n",
                "141-1800394452",
                "TS19"));
        bibliotheque.ajouterLivre(new LivreDeCollection(
                "Andrew Tanembaum",
                "Architecture de l'Ordinateur\n",
                "978-2729601331",
                "UB40", "Sensass"));
        bibliotheque.ajouterLivre(new LivreDeCollection(
                "VEIGNEAU S.",
                "Approches impérative et fonctionnelle de l'algorithmique\n",
                "645-0209142674",
                "UB66", "Sensass"));


        bibliotheque.consulterBibliotheque();

        System.out.println("--------------------------------------------------------------------------------------");

        bibliotheque.emprunter("Eden Hazard", "AS30", LocalDate.of(2021, 8, 29));
        bibliotheque.emprunter("Pipo Inzaghi", "AS30", LocalDate.of(2021, 8, 29));

    }

}
