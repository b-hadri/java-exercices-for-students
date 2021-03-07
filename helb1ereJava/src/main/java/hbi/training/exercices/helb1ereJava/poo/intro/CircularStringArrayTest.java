package hbi.training.exercices.helb1ereJava.poo.intro;

public class CircularStringArrayTest {

    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        CircularStringArray myCircularArray = new CircularStringArray(cars);

        System.out.println(myCircularArray.getItem(0)); // retourne Volvo
        System.out.println(myCircularArray.getItem(-1)); // retourne Mazda
        System.out.println(myCircularArray.getItem(4)) ; // retourne Volvo
        System.out.println(myCircularArray.getItem(5)) ; // retourne BMW

        /*

        0 =>? 0 (0 % 4 == 0)
        -1 =>? 3 ( -1 % 4 == -1 ===>? 3  puis si -1 + array.length ===> 3)
        4 =>? 0 (4 % 4 == 0) équivaut à iParam % array.length ==> 0)
        5 =>? 1 (5 % 4 == 1) équivaut à iParam % array.length ===> 1)

         */

    }

}
