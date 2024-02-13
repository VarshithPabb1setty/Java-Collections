import java.util.*;

public class TreeSetComparator {
    public static void main(String args[]) {
        TreeSet<Object> t = new TreeSet<>(new myIntegerComparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(20);
        t.add(20);
        TreeSet<Object> s = new TreeSet<>(new myStringComparator());
        s.add("varshith");
        s.add("vaishnavi");
        s.add("likitha");
        s.add("ruthvik");
        s.add("pruthvi");
        s.add("saikiran");
        s.add("harsha");
        s.add("sohan");
        TreeSet<Object> sl = new TreeSet<>(new myStringLengthComparator());
        sl.add("A");
        sl.add("ABCD");
        sl.add(new StringBuffer("ABC"));
        sl.add("XX");
        sl.add(new StringBuffer("AA"));
        System.out.println(t);
        System.out.println(s);
        System.out.println(sl);
    }
}

class myIntegerComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Integer I1 = (Integer)obj1;
        Integer I2 = (Integer)obj2;

        if (I1 < I2) {
            return +1; // If an object should be displayed on right side of other object after comparison it should return +ve value(because +ve values are always on right side)
        } else if (I1 > I2) {
            return -1; // If an object should be displayed on left side of other object after comparison it should return -ve value(because -ve values are always on left side)
        } else {
            return 0;
        }

        // return I1.compareTo(I2); // [0,10,15,20] ascending order
		// return -I1.compareTo(I2); // [20,15,10,0] descending order
		// return I2.compareTo(I1); // [20,15,10,0] descending order
		// return -I2.compareTo(I1); // [0,10,15,20] ascending order
		// return +1; // [10,0,15,20,20] Insertion order
		// return -1; // [20,20,15,0,10] Reverse of Insertion order
		// return 0; // [10] (only first element will be inserted and all the other elements are considered as duplicates)
    }
}

class myStringComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String S1 = (String) obj1;
        String S2 = (String) obj2; 
        return S2.compareTo(S1);
    }
}

class myStringLengthComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        String s2 = obj2.toString();

        if (s1.length() < s2.length()) {
            return -1;
        } else if (s1.length() > s2.length()) {
            return +1;
        } else {
            return s1.compareTo(s2);
        }
    }
}