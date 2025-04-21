import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Main {  // Renamed class to match the filename
    public static void main(String[] args) {
        // ArrayList Example
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("ArrayList: " + list);

        // HashMap Example
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println("HashMap: " + map);

        // HashSet Example
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // Duplicate, won't be added
        System.out.println("HashSet: " + set);

        // Random Number Example
        Random random = new Random();
        System.out.println("Random Number: " + random.nextInt(100));
    }
}
