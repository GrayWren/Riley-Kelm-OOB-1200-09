import java.util.Scanner;
public class TestNumberTools {
    private static Scanner input = new Scanner((System.in));
    public static void main(String[] args) {

        System.out.println("Please enter an interger");


        // check if the input has an interger stored in it and as long as it doesnt ask again
        while (!input.hasNextInt()){
            System.out.println("Please enter a valid integer");
            input.next();
        }
        //Gets a new input
        int num= input.nextInt();

        // looks at the return for each called function and gives the appropriate response
        if(NumberTools.isEven(num)){
            System.out.println("Is "+num+" an even number? Yes");
        }else {
            System.out.println("Is "+num+" an even number? No");
        }
        if(NumberTools.isPositive(num)){
            System.out.println("Is "+num+" a positive number? Yes");
        }else {
            System.out.println("Is "+num+" a positive number? No");
        }

        if(NumberTools.isFibonacci(num)){
            System.out.println("Is "+num+" a Fibonacci number? Yes");
        }else {
            System.out.println("Is "+num+" a Fibonacci number? No");
        }

        if(NumberTools.isPowerofTwo(num)){
            System.out.println("Is "+num+" an power of two? Yes");
        }else {
            System.out.println("Is "+num+" an power of two? No");
        }

        if(NumberTools.isPrime(num)){
            System.out.println("Is "+num+" a prime number? Yes");
        }else {
            System.out.println("Is "+num+" a prime number? No");
        }

        if(NumberTools.isSquare(num)){
            System.out.println("Is "+num+" a square number? Yes");
        }else {
            System.out.println("Is "+num+" a square number? No");
        }
    }
}
