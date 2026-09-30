import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(10);

        System.out.println("Original : " + list);
        System.out.println("Index 1  : " + list.get(1));
        list.remove(Integer.valueOf(10));
        System.out.println("After remove(10): " + list);

        Collections.sort(list);
        System.out.println("Sorted   : " + list);

        System.out.print("For-each  : ");
        for(int n : list) System.out.print(n + " ");

        System.out.print("\nIterator  : ");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) System.out.print(it.next() + " ");

        System.out.println("\nSize = " + list.size());
        System.out.println("ArrayList: dynamic array, O(1) get, O(n) insert/remove middle");
    }
}
