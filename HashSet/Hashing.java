import java.util.HashSet;

import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // Insert in hashset->
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        // Print elements in hashsets->
        System.out.println(set);
        // System.out.println(set.size());

        // Delete the element from hashset->
        set.remove(1);
        System.out.println(set);

        // Serarch the element in hashset->return(true or false)
        System.out.println(set.contains(3));

        // Iteration ->
        // it.next->point at the next element in the hashset and return the element
        // it.hasnext()->return boolean value (true or false) for the hashset is null or
        // not.
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "->");
        }
    }
}