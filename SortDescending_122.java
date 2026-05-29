// Sort an ArrayList in Descending Order.

import java.util.*;

public class SortDescending_122 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(45);
        list.add(12);
        list.add(89);
        list.add(34);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
    }
}