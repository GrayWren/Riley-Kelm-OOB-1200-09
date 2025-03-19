package exception;

public class Exp {
    public static void main(String[] args) {
        try {
            int c=10/0;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occurs: "+e.getMessage());
        }
    }
}
