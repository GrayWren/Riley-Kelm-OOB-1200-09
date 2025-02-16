import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<String>();
        names.add("50");
        names.add("2");
        names.add("3");
        names.add("4");
        names.set(2,"bob");
        names.add(3,"stan");
        names.remove(1);

        Collections.sort(names);
        System.out.println(names);
    }
}
