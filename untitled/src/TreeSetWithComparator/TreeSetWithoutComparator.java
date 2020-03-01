package TreeSetWithComparator;

import java.util.TreeSet;

public class TreeSetWithoutComparator {
    public static void main(String[] args) {

        //Elements will be saved in ascending order
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(11);
        treeSet.add(23);
        treeSet.add(5);
        treeSet.add(18);
        treeSet.add(15);

        System.out.println(treeSet);
    }
}
