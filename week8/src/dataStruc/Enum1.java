package dataStruc;
enum Grades{
    LOW,
    MEDIUM,
    HIGH
}

public class Enum1 {
    public static void main(String[] args) {
       // Grades g= Grades.MEDIUM;
//        switch(g){
//            case LOW :
//                System.out.println("Grades are low");
//                break;
//            case HIGH:
//                    System.out.println("Grades are high");
//                    break;
//            case MEDIUM:
//                System.out.println("Grades are medium");
//                break;
//        }
        for(Grades g: Grades.values()){
            System.out.println(g);
        }
    }

}
