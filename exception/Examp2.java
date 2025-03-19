package exception;

public class Examp2 {
    public static void main(String[] args) {
        int[] num =new int [5];
        try {
            System.out.println("try 1");
            num[3]=20;
            System.out.println("try 2");
        } catch (Exception e) {
            System.out.println();
        }
    }
    public static void errMethod(int [] num){
        num[10]=25;
    }
}
