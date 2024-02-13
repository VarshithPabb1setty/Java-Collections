import java.util.*;

public class ArrayListInterface {
    public static void main(String args[]) {
        ArrayList<Object> al = new ArrayList<Object>();
        al.add("A");
        al.add("B");
        al.add(10);
        al.add("A");
        al.add(null);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.add(2, "M");
        al.add("N");
        System.out.println(al);
        al.set(4, "D");
        System.out.println(al);
        System.out.println(al.indexOf("A"));
        System.out.println(al.lastIndexOf("A"));
    }
}
