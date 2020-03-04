package hbi.training.exercices.java3helb2eme.ex002Chaine2Threads;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @Author Bilal HADRI
 * @Date : 04/03/2020, Wednesday, 04 March 2020
 */
public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {

        String fileName = "ex002-lists.txt";

        Stream<String> linesStream = getFileLinesFromRessourcesFolder(fileName);
        linesStream.forEach(s -> System.out.println(s));

        // récupérer les chaines de caractères

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



    }

    private static Stream<String> getFileLinesFromRessourcesFolder(String fileName) throws IOException {
        Path path = Paths.get("java3helb2eme","src", "main", "resources", fileName);

        return Files.lines(path);
    }

}
