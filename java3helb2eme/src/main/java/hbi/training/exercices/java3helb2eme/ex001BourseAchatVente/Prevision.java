package hbi.training.exercices.java3helb2eme.ex001BourseAchatVente;

import lombok.Getter;
import lombok.ToString;

/**
 * @Author Bilal HADRI
 * @Date : 04/03/2020, Wednesday, 04 March 2020
 */
@ToString
@Getter
public class Prevision implements Comparable<Prevision> {

    private final int heure;
    private final Double prixAction;

    public Prevision(int heure, Double prixAction) {
        this.heure = heure;
        this.prixAction = prixAction;
    }

    @Override
    public int compareTo(Prevision p) {
        return prixAction.compareTo(p.prixAction);
    }

}
