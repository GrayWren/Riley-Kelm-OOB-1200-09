package dataStruc;

import java.util.LinkedList;
import java.util.Queue;

public class Qu {
    public static void main(String[] args) {
        Queue<String> q= new LinkedList<>();
        q.add("mmm");
        q.add("kk");
       String var =q.peek();
        System.out.println(var);
        q.remove();
        System.out.println(q);
    }
}
