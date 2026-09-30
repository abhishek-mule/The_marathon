import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);

        System.out.println("HashSet (no duplicates, no order): " + set);
        System.out.println("Size = " + set.size() + "  -> add(20) was ignored");
        System.out.println("Contains 20: " + set.contains(20));

        Set<String> ordered = new LinkedHashSet<>();
        ordered.add("java");
        ordered.add("react");
        ordered.add("sql");
        System.out.println("LinkedHashSet (insertion order): " + ordered);

        System.out.println("Set: O(1) add/contains, duplicates not allowed");
    }
}
