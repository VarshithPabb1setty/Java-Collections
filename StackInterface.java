import java.util.*;

public class StackInterface {
    public static void main(String args[]) {
        Stack<Object> s = new Stack<>();
        System.out.println(s.empty());
        s.push("A");
        s.push("B");
        s.push("C");
        s.pop();
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.search("A"));
        System.out.println(s.search("Z"));
    }
}
