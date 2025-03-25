package dataStruc;
import java.util.ArrayList;
public class ArList {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>();
        arr.add("John");
        arr.add("Peter");
        arr.add("Cherry");
        arr.add("Paul");

        arr.add(0,"RAM");
        arr.set(2,"Liya");
        arr.remove(4);
        arr.clear();
        System.out.println(arr);
    }
}
