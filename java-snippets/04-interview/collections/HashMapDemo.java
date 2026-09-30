import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args){
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Alice", 90);
        marks.put("Bob", 85);
        marks.put("Carol", 92);
        marks.put("Alice", 95);

        System.out.println("Map      : " + marks);
        System.out.println("Bob      : " + marks.get("Bob"));
        System.out.println("Contains : " + marks.containsKey("Dave"));
        System.out.println("Keys     : " + marks.keySet());

        System.out.print("Iteration: ");
        for(Map.Entry<String, Integer> e : marks.entrySet()){
            System.out.print(e.getKey() + "=" + e.getValue() + " ");
        }

        System.out.println("\nAverage  : " + marks.values().stream().mapToInt(Integer::intValue).average().orElse(0));
        System.out.println("HashMap: O(1) average put/get, no order guarantee (use LinkedHashMap for order)");
    }
}
