import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        // Insetion->
        map.put(1, "Khushi");
        map.put(2, "Tejas");
        map.put(3, "Sahil");
        map.put(4, "roshan");
        System.out.println(map);

        // Searching->
        System.out.println(map.containsValue("Khushi"));
        System.out.println(map.containsKey(1));

        // Iteration(1)
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Iteration(2)
        Set<Integer> keys = map.keySet();
        for (int key : keys) {
            System.out.println(map.get(key));
        }
    }
}