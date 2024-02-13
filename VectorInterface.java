import java.util.*;

public class VectorInterface {
    public static void main(String args[]) {
        // Vector<Object> v = new Vector<>(); // Initial Capacity 10
        // Vector<Object> v = new Vector<>(25); // Initial Capacity 25
        Vector<Object> v = new Vector<>(25, 5);
        System.out.println(v.capacity());
        for (int i = 1; i <= 25; i++) {
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement("Z");
        System.out.println(v.capacity());
        System.out.println(v);
    }
}
