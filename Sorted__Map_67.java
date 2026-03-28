/*Keys live in sorted order.
  Mostly TreeMap

Insert → put()
Delete → remove()
Update → put() */

import java.util.*;

class Sorted__Map_67 {
    public static void main(String[] args) {
SortedMap<Integer, String> map = new TreeMap<>();

map.put(3, "C");
map.put(1, "A");
map.put(2, "B");  // sorted by key

map.remove(1);

// update
map.put(2, "BB");

System.out.println(map);
    }
}