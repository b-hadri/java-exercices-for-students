package hbi.training.exercices.helb1ereJava.poo.intro;

public class CircularStringArray {

    private String [] array;

    public CircularStringArray(String[] array) {
        this.array = array;
    }

    public String getItem(int i) {
        int indexArray = i % array.length; // 1 ;

        if (indexArray < 0) {
            indexArray = array.length + indexArray;
        }

        return array[indexArray];
    }
}
