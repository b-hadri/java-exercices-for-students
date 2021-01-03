package hbi.training.exercices.helb1ereJava.examens.e20200605_UE_1_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercice2Test {

    @Test
    void testerVerifier() {

        String chaine = "[un] [deux] [trois]";
        assertEquals(Exercice2.verifier(chaine), true);

        chaine = "]un[ [deux] [trois]";
        assertEquals(Exercice2.verifier(chaine), false);

        chaine = "[un] [deux] [trois";
        assertEquals(Exercice2.verifier(chaine), false);

        chaine = "[un] deux] [trois";
        assertEquals(Exercice2.verifier(chaine), false);

    }

    @Test
    void testerTrouverMotifDebut() {

        String chaine = "blablba[un]du contenu[nu] reblabla";
        assertEquals(11, Exercice2.trouverMotifDebut(chaine, "un"));

        chaine = "blablba[un]ducontenu[nu]reblabla";
        assertEquals(-1, Exercice2.trouverMotifDebut(chaine, "deux"));

    }

    @Test
    void testerTrouverMotifFin() {

        String chaine = "blablba[un]du contenu[nu] reblabla";
        assertEquals(21, Exercice2.trouverMotifFin(chaine, "un"));

        chaine = "blablba[un]ducontenu[nu]reblabla";
        assertEquals(-1, Exercice2.trouverMotifFin(chaine, "deux"));

    }

    @Test
    void testerExtraireEntreMotif() {

        String chaine = "blablba[un]du contenu[nu] reblabla";
        assertEquals("du contenu", Exercice2.extraireEntreMotif(chaine, "un"));

        chaine = "blablba[un]ducontenu[nu]reblabla";
        assertEquals("", Exercice2.extraireEntreMotif(chaine, "deux"));

        chaine = "[racine]du contenu [adresse]23 rue des ciseaux[esserda] une plante [enicar]";
        assertEquals("du contenu [adresse]23 rue des ciseaux[esserda] une plante ",
                Exercice2.extraireEntreMotif(chaine, "racine"));

    }

    @Test
    void testerTrouverMotif() {

        String chaine = "blablba[un]du contenu[nu] reblabla";
        assertEquals("un", Exercice2.trouverMotif(chaine));

        chaine = "du contenu";
        assertEquals("", Exercice2.trouverMotif(chaine));

    }
}