import java.util.*;

public class TreeSetInterface {
    public static void main (String args[]) {
        TreeSet<Object> t = new TreeSet<>();
        t.add("A");
        t.add("a");
        t.add("Z");
        t.add("L");
        // t.add(10); // Runtime Exception - ClassCastException
        // t.add(null);  // NullPointerException
        // t.add(new StringBuffer("A"));
        // t.add(new StringBuffer("Z"));
        // t.add(new StringBuffer("B"));
        // t.add(new StringBuffer("L"));
        System.out.println(t);
    }
}
