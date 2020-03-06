package hbi.training.exercices.java3helb2eme.ex003AnimalCrier;

/**
 * @Author Bilal HADRI
 * @Date : 04/03/2020, Wednesday, 04 March 2020
 */
public class Main {

    public static void main(String[] args) {

        AnimalQuiCri [] tableauAnimauxQuiCrient = {
          new Chat("Chatooooooo"),
          new Chien("Chicho"),
          new Chien("Chicho 2"),
          new Chat("Chatooooooo 2"),
        };

        for (AnimalQuiCri animalQuiCri : tableauAnimauxQuiCrient) {
            animalQuiCri.crier();
        }

    }

}
