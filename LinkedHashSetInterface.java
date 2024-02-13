import java.util.*;

public class LinkedHashSetInterface {
    public static void main(String args[]) {
        LinkedHashSet<Object> lhs = new LinkedHashSet<>();
        lhs.add("A");
        lhs.add("B");
        lhs.add("Z");
        lhs.add("E");
        lhs.add(null);
        lhs.add(10);
        System.out.println(lhs.add("Z"));
        System.out.println(lhs);
    }
}
