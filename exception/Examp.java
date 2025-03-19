package exception;

public class Examp {
    public static void main(String[] args) {
        int [] num=new int[5];
        try {
            System.out.println("Try 1");
            num[10]=3;
            System.out.println("try after error");
        }catch (Exception e){
            System.out.println("Exception is performing");
        }
        System.out.println("after try catch block");
    }
}
