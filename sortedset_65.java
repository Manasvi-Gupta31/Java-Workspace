// Automatically maintains sorted order.
/*  Mostly TreeSet uses here

Insert → add()
Delete → remove()
Update → indirect (remove + add) */

import java.util.*;

class sortedset_65 {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20); // sorted output: 10 20 30

        set.remove(10);

        // update
        set.remove(20);
        set.add(25);

        System.out.println(set);
    }
}