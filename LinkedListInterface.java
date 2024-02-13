import java.util.*;

public class LinkedListInterface {
    public static void main(String args[]) {
        LinkedList<Object> l1 = new LinkedList<Object>();
        l1.add("Varshith");
        l1.add(10);
        l1.add("Pabbisetty");
        l1.add(null);
        l1.add(4, "Krishna");
        System.out.println(l1);
        l1.set(0, "Krishna Varshith");
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
        l1.addFirst("Mr. ");
        System.out.println(l1);
    }
}
