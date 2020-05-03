package hbi.training.exercices.java3helb2eme.t003MethodesReferences;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Supplier;

public class ReferenceMethodeEnPratique {

    public static void main(String[] args) {

        Supplier<Animal> supplierAnimal = new Supplier<Animal>() {
            @Override
            public Animal get() {
                return new Animal();
            }
        };
        
        Supplier<Animal> supplierAnimal2 = Animal::new;

//        Animal a = Animal::new;

    }

}

class Animal {

    private String nom;

    public Animal() {
    }
}

