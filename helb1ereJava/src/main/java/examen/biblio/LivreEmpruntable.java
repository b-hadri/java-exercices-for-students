package examen.biblio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LivreEmpruntable extends LivreDeBibliotheque {

    private String idClient;
    private LocalDate dateDeRetour;

    public LivreEmpruntable(String auteur, String titre, String isbn, String numeroDeLocalisation) {
        super(auteur, titre, isbn, numeroDeLocalisation);
        this.idClient = idClient;
        this.dateDeRetour = dateDeRetour;
    }

    public String getIdClient() {
        return idClient;
    }

    public LocalDate getDateDeRetour() {
        return dateDeRetour;
    }

    @Override
    public String statut() {
        if (idClient == null) {
            return "le livre est disponible dans la bibliothèque";
        }
        return "le livre a été emprunté par "+idClient+" et sera de retour le "+dateDeRetour.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    @Override
    public void retourner() {
        this.idClient = null;
        this.dateDeRetour = null;
    }

    @Override
    public void emprunter(String numeroDeClient, LocalDate dateDeRetour) {
        this.idClient = numeroDeClient;
        this.dateDeRetour = dateDeRetour;
    }
}
