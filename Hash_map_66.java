/* Map stores Key-Value pair.
   Duplicate keys are not allowed.

Example: HashMap
Insert → put()
Delete → remove()
Update → put() (same key → value replace) */

import java.util.*;

class Hash_map_66 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Insertion
        map.put(1, " Aman");
        map.put(2, " Riya");

        // Deletion
        map.remove(1);

        // Update
        map.put(2, " Priya"); // value change

        System.out.println(map);
    }
}