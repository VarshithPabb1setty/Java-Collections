import java.util.*;

public class HashSetInterface {
    public static void main(String args[]) {
        HashSet<Object> h = new HashSet<>();
        h.add("B");
        h.add("D");
        h.add("A");
        h.add("C");
        h.add(null);
        h.add(10);
        System.out.println(h.add("C"));
        System.out.println(h);
    }
}
