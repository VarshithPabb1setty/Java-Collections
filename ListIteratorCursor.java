import java.util.*;

public class ListIteratorCursor {
    public static void main(String args[]) {
        LinkedList<String> l = new LinkedList<>();
        l.add("Balakrishna");
        l.add("Chiranjeevi");
        l.add("Nagarjuna");
        l.add("Venkatesh");
        System.out.println(l);
        ListIterator<String> ltr = l.listIterator();
        while (ltr.hasNext()) {
            String s = (String)ltr.next();
            if(s.equals("Balakrishna")) {
                ltr.remove();
            } else if (s.equals("Nagarjuna")) {
                ltr.add("Chaitanya");
            } else if (s.equals("Venkatesh")) {
                ltr.set("Rana");
            }
        }
        System.out.println(l);
    }
}
