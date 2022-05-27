package examen.biblio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    private List<Livre> livres;

    public Bibliotheque() {
        this.livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        this.livres.add(livre);
    }

    public void consulterBibliotheque() {
        System.out.println("Voici la liste des livres de la bibliothèque\n" +
                "============================================\n\n");
        this.livres.forEach(livre -> System.out.println(livre+"\n"));
    }

    public Livre trouverLivre(String numeroDeLocalisation) {
        Livre livreATrouver = null;
        for (int i = 0; i < this.livres.size(); i++) {
            Livre livre = this.livres.get(i);
            if (livre instanceof LivreDeBibliotheque) {
                LivreDeBibliotheque livreDeBibliotheque = (LivreDeBibliotheque) livre;
                if (livreDeBibliotheque.getNumeroDeLocalisation() != null
                        && livreDeBibliotheque.getNumeroDeLocalisation().equals(numeroDeLocalisation)) {
                    livreATrouver = livreDeBibliotheque;
                }
            }
        }
        return livreATrouver;
    }

    public void trierBibliotheque() {
        livres.sort((o1, o2)->o1.compareTo(o2));
    }

    public void emprunter(String idClient, String numeroDeLocalisation, LocalDate dateDeRetour) {
        LivreDeBibliotheque livre = (LivreDeBibliotheque) this.trouverLivre(numeroDeLocalisation);
        if (livre instanceof LivreDeCollection) {
            System.out.println(idClient + " ne peut pas emprunter le livre "+numeroDeLocalisation+" car il s'agit d'un livre de collection");
        } else if (livre instanceof LivreEmpruntable){
            // il est empruntable
            LivreEmpruntable livreEmpruntable = (LivreEmpruntable) livre;

            if (livreEmpruntable.getIdClient() == null) { // il est empruntable
                livreEmpruntable.emprunter(idClient, dateDeRetour);
                System.out.println(idClient+" emprunte le livre "+numeroDeLocalisation+" pour un retour le "+formatDate(dateDeRetour));
            } else {
                System.out.println(idClient +" souhaite emprunter le livre "+numeroDeLocalisation+" mais cela est impossible car le livre est déjà en prêt");
            }


        } else {
            System.out.println("ERREUR cas non géré !!!");
        }
    };

    public void retourner(String numeroDeLocalisationid) {

    };

    private String formatDate(LocalDate localDate) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return localDate.format(dtf);
    }
}
