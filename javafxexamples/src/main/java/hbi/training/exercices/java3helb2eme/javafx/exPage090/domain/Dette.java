package hbi.training.exercices.java3helb2eme.javafx.exPage090.domain;

public class Dette {

    private String nomCompletDuCreancier; // Personne à qui on doit de l'argent
    private Double montant;

    public Dette(String nomCompletDuCreancier, Double montant) {
        this.nomCompletDuCreancier = nomCompletDuCreancier;
        this.montant = montant;
    }

    public String getNomCompletDuCreancier() {
        return nomCompletDuCreancier;
    }

    public Double getMontant() {
        return montant;
    }
}
