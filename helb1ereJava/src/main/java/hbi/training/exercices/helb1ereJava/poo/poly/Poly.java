package hbi.training.exercices.helb1ereJava.poo.poly;

public class Poly {

    public static void main(String[] args) throws CloneNotSupportedException {


        Ours ours1 = new Ours("Bazil");
        System.out.println(ours1);

        Ours ours2 = (Ours) ours1.clone();
        System.out.println(ours2);

        System.out.println("-----------------");

        ours1.setName("Lisab");

        System.out.println(ours1);
        System.out.println(ours2);


    }
}


interface IAnimal {

    public void manger();

    public void seDeplacer();

}

// Hicham

class Ours implements IAnimal, Cloneable {

    private String name;

    public Ours(String name) {
        this.name = name;
    }

    public void manger() {
        System.out.println("Je mange des cerises, des fraises, dès fois du saumon...");
    }

    public void seDeplacer() {
        System.out.println("Je me déplace à quatre pattes, dès fois et lorsque je suis faché, sur deux pattes");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Ours(this.name);
    }

    @Override
    public String toString() {
        return "Ours{" + "name='" + name + '\'' + '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Saumon implements IAnimal {

    public void manger() {
        System.out.println("Je mange dans l'eau...");
    }

    public void seDeplacer() {
        System.out.println("Je me déplace en nageant...");
    }
}


// Zoo (...)

class Zoo {

    public void faireDeplacerUnAnimal(IAnimal animal) {
        animal.seDeplacer();
    }

}



