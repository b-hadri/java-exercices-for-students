package hbi.training.exercices.helb1ereJava.poo.exsnakegame;

import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.jline.utils.NonBlockingReader;

import java.io.IOException;
import java.util.Scanner;

public class JeuDeSerpent {

    private Joueur joueur;
    private Serpent serpent;
    private Grille grille;
//    private Liste<RegleDuJeu>...


    public JeuDeSerpent(Joueur joueur, Serpent serpent, Grille grille) {
        this.joueur = joueur;
        this.serpent = serpent;
        this.grille = grille;
    }

    public void commencerLeJeu() {
        System.out.println("Le jeu commence : )");

        try {
            Terminal terminal = getTerminal();

            // raw mode means we get keypresses rather than line buffered input
            terminal.enterRawMode();
            NonBlockingReader reader = terminal.reader();

            int count = 0;

            boolean continueToPlay = true;
            do {
                // Character input
                int read = reader.read();

                System.out.println("read = " + read);

                if (count == 5)
                    continueToPlay = false;

                count++;
            } while (continueToPlay);

            // serpent.tourner(direction);
            // serpent.avancer();
            // System.out.println(this.retournerLEtatDuJeu());

            reader.close();
            terminal.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private Terminal getTerminal() throws IOException {
        return TerminalBuilder.builder()
                              .jna(true)
                              .system(true)
                              .build();

    }

    private String retournerLEtatDuJeu() {
        StringBuilder out = new StringBuilder();

        out.append("============================================" + "\n");
        out.append(this.joueur + "\n");
        out.append("La longueur du serpent: " + serpent.getLongueur() + "\n");
        out.append(this.grille.afficherLaGrilleAvec(this.serpent));

        return out.toString();
    }
}
