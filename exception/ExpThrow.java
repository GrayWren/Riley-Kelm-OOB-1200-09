package exception;
import java.util.Scanner;
public class ExpThrow {

    public static int quotient(int numerator,int denominator){
        if (denominator==0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return numerator/denominator;

    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter an integer numerator: ");
        int numerator=input.nextInt();
        System.out.println("Please enter an integer denominator");
        int denominator=input.nextInt();
        int result=quotient(numerator,denominator);
        System.out.printf("Result: %d/%d=%d",numerator,denominator,result);;

    }
}
