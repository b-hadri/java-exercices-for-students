package hbi.training.exercices.java3helb2eme.javafx.exPage090.domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dette dette = (Dette) o;
        return Objects.equals(nomCompletDuCreancier, dette.nomCompletDuCreancier) &&
                Objects.equals(montant, dette.montant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomCompletDuCreancier, montant);
    }
}
