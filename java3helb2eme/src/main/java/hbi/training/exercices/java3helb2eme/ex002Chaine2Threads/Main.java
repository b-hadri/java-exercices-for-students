package hbi.training.exercices.java3helb2eme.ex002Chaine2Threads;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @Author Bilal HADRI
 * @Date : 04/03/2020, Wednesday, 04 March 2020
 */
public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {

        String nomFichierAvecChaines = "ex002-lists.txt";
        String nomFichierResultat = "ex002-lists-"+System.currentTimeMillis()+".txt";

        FichierDeChainesTransformeur manipulateur = new FichierDeChainesTransformeur(nomFichierAvecChaines, nomFichierResultat);
        manipulateur.runTransformation();

    }

}

// 2 threads

// Thread 1 prend la 1ere chaine
    // prendre une chaine
        // Trier par ordre alphabétique
        // MAJUSCULE minuscule MAJUSCULE minuscule
        // sauver le résultat dans le fichier resultat

// Thread 2 prend la 2eme chaine
    // prendre une chaine
        // Trier par ordre alphabétique
        // minuscule MAJUSCULE minuscule MAJUSCULE
        // sauver le résultat dans le fichier resultat

// Thread 1 prend la 3eme chaine
    // prendre une chaine
        // Trier par ordre alphabétique
        // MAJUSCULE minuscule MAJUSCULE minuscule
        // sauver le résultat dans le fichier resultat

// ...
