package hbi.training.exercices.helb1ereJava.poo.interface2;

import hbi.training.exercices.helb1ereJava.poo.interface2.dbimplementation.BaseDeDonneesInMemory;
import hbi.training.exercices.helb1ereJava.poo.interface2.dbimplementation.BaseDeDonneesRapide;

/*

Equipe: 2 personnes

Une personne qui s'occupe de la base de données (Ismael)
Une autre du formulaire et du code business (Mounir)

 */
public class Main {

    public static void main(String[] args) {
        System.out.println("--- main ---");

        IBaseDeDonnees baseDeDonnees = new BaseDeDonneesRapide();

        IInscription inscription =
                new InscriptionImpl("1", "Premier", "Adam");

        baseDeDonnees.sauver(inscription);
        baseDeDonnees.sauver(inscription);

        inscription =
                new InscriptionImpl("2", "Second", "Adam");

        baseDeDonnees.sauver(inscription);

        System.out.println(baseDeDonnees.nombreInscrits());

    }

}
