package maps;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Etudiant> etudiants = new TreeSet<Etudiant>(new ComparatorViaNom().reversed());

        etudiants.add(new Etudiant(56, "nomA", "prenomA"));
        etudiants.add(new Etudiant(1, "nomB", "prenomB"));
        etudiants.add(new Etudiant(8, "nomC", "prenomC"));
        etudiants.add(new Etudiant(6, "nomD", "prenomD"));

        etudiants.pollFirst();

        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }

    }

}
