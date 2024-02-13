import java.util.*;

public class ImplementationOfCursors {
    public static void main(String args[]) {
        Vector<Object> v = new Vector<>();
        Enumeration<Object> e = v.elements();
        Iterator<Object> itr = v.iterator();
        ListIterator<Object> ltr = v.listIterator();
        System.out.println(e.getClass().getName());
        System.out.println(itr.getClass().getName());
        System.out.println(ltr.getClass().getName());
    }
}
