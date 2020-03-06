package hbi.training.exercices.java3helb2eme.ex002Chaine2Threads;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Bilal HADRI
 * @Date : 04/03/2020, Wednesday, 04 March 2020
 */
public class LigneManipulateur implements Runnable {

    private final List<String> chainesList;
    private final PrintWriter outputWriter;
    private final int startIndexAt;

    public LigneManipulateur(boolean manipulerLesLignesImpaires, List<String> chainesList, PrintWriter outputWriter) {
        this.chainesList = chainesList;
        this.outputWriter = outputWriter;
        this.startIndexAt = (manipulerLesLignesImpaires)? 0: 1;
    }

    @Override
    public void run() {

        // lignes impaires
        for (int i = startIndexAt; i  < this.chainesList.size(); i += 2) {
            System.out.println("\nINDEX  = "+i);

            String chaineTriee = trierChaine(this.chainesList.get(i));
            String chaineTrieeEtCapitalisee = capitaliserChaine(chaineTriee);

            outputWriter.write(chaineTrieeEtCapitalisee+"\n");
        }

    }

    public String trierChaine(String chaine) {
        char tempArray[] = chaine.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    private String capitaliserChaine(String chaine) {
        chaine = chaine.toLowerCase();
        char tempArray[] = chaine.toCharArray();
        for (int i = startIndexAt; i < tempArray.length; i += 2) {
            tempArray[i] = Character.toUpperCase(tempArray[i]);
        }
        return new String(tempArray);
    }
}
