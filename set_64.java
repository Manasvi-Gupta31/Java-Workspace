// Set doesn't allow duplicate value so we can't update here.
// But we can insert and delete the elements.

import java.util.*;

class set_64 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // Insertion
        set.add(10);
        set.add(20);

        // Deletion
        set.remove(10);

        // Update (indirect)
        set.remove(20);    // here we first remove then add an element, 
        set.add(30);                 //we can't call it update but it's an indirect way

        System.out.println(set);
    }
}

