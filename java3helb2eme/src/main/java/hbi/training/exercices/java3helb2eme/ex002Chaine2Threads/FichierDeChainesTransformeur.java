package hbi.training.exercices.java3helb2eme.ex002Chaine2Threads;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author Bilal HADRI
 * @Date : 04/03/2020, Wednesday, 04 March 2020
 */
public class FichierDeChainesTransformeur {

    private final List<String> chainesList;
    private final PrintWriter fichierResultat;

    public FichierDeChainesTransformeur(String fichierAvecChaines, String fichierResultat) throws IOException {
        this.chainesList = getFileLinesFromRessourcesFolder(fichierAvecChaines).collect(Collectors.toList());
        this.fichierResultat = getFichierResultat(fichierResultat);
    }

    public void runTransformation() {

        LigneManipulateur lignesImpairesManipulateur = new LigneManipulateur(true, chainesList, fichierResultat);
        LigneManipulateur lignesPairesManipulateur = new LigneManipulateur(false, chainesList, fichierResultat);

        Thread threadLigneImpaire = new Thread(lignesImpairesManipulateur);
        Thread threadLignePaire = new Thread(lignesPairesManipulateur);
        threadLigneImpaire.start();
        threadLignePaire.start();

        while (threadLigneImpaire.isAlive() || threadLignePaire.isAlive()){
            System.out.print(".");
        }

        fichierResultat.close();
    }

    private Stream<String> getFileLinesFromRessourcesFolder(String fileName) throws IOException {
        Path path = Paths.get("java3helb2eme","src", "main", "resources", fileName);
        return Files.lines(path);
    }

    private PrintWriter getFichierResultat(String fileName) throws IOException {
        Path path = Paths.get("java3helb2eme","src", "main", "resources", fileName);
        return new PrintWriter(new FileWriter(path.toFile()));
    }

}
