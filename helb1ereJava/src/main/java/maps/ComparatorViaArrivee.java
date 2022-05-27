package maps;

import java.util.Comparator;

public class ComparatorViaArrivee implements Comparator<Etudiant> {


    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        return o1.getDateArrivee().compareTo(o2.getDateArrivee());
    }
}
