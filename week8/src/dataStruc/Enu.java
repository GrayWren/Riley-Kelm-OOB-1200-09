package dataStruc;

public class Enu {
;
    enum Grades{
    LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Grades g= Grades.HIGH;
        System.out.println(g);
    }
}
