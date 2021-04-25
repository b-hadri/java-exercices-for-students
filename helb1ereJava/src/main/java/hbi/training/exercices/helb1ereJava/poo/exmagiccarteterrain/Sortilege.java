package hbi.training.exercices.helb1ereJava.poo.exmagiccarteterrain;

public class Sortilege extends Carte {

    private String nomSortilege;
    private String explicationSortilege;

    public Sortilege(int cout, String nomSortilege, String explicationSortilege) {
        super(cout);

        this.nomSortilege = nomSortilege;
        this.explicationSortilege = explicationSortilege;

        System.out.println("Un sortilège de plus");
    }

    @Override
    public void afficher() {
        System.out.println("Un sortilège "+this.nomSortilege);
    }
}
