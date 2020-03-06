package hbi.training.exercices.java3helb2eme.ex003AnimalCrier;

/**
 * @Author Bilal HADRI
 * @Date : 04/03/2020, Wednesday, 04 March 2020
 */
public class Chat extends Animal implements AnimalQuiCri {

    public Chat(String nom) {
        super(nom);
    }

    @Override
    public void crier() {
        System.out.println("Miouuuuuuuuuuuuuuuuu");
    }

}
