package maps;

import java.util.TreeSet;

public class ImplementComparable implements Comparable {

    public static void main(String[] args) {

        TreeSet<Integer> tree = new TreeSet<>();

        tree.add(3);
        tree.add(5);
        tree.add(1);
        tree.add(2);

        tree.forEach((integer -> System.out.println(integer)));

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}


