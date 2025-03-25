package dataStruc;
import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Stack<String> s= new Stack<>();
        s.push("Hi how are u");
        s.push("P good ty");
        s.push("seee ya");
        s.push("bye bye");
        System.out.println(s.peek());
        s.pop();

    }

}
