
import java.lang.Math;
public class NumberTools {

//check if n modulared by 2 is equal to zero
    public static boolean isEven(int n){
        if (n%2==0){

            return true;
        }else {
            return false;
        }
    }
//Checks if the value isnt less then zero
    public static boolean isPositive(int n){
        if (Math.abs(n)==n){
            return true;
        }else {
            return false;
        }
    }

    //Runs through the Fibonacci system up until n while checking if n is ever a value in thr sequence
    public static boolean isFibonacci(int n){
        if(n<0) return false;
        int num1=0;
        int num2=1;
        boolean found=false;
        for(int i=0; i<n; i++){
            int num3=num1+num2;
            num1=num2;
            num2=num3;
            if (num3==n){
                found=true;
            }

        }
        return found;

    }

//makes n a float so it doesnt crash and keeps dividing the number by two until its either 1 or less then one
    public static boolean isPowerofTwo(int n) {
        boolean check=false;
        float num=n;
        if (num<0) return false;
        while (num>1){
            num=num/2;
            if (num == 1 ) {
                check=true;
            }
        }
        return check;
    }

    //Squares n then multiplies that square by itself and so will only work if the square root of n is an integer
    public static boolean isSquare(int n){
        if (Math.sqrt(n)*Math.sqrt(n)==n){
            return true;
        }else {
            return false;
        }

    }

    //Checks if it can be modularly divided by 2,3,5,7 and if it can be it returns true
    public static boolean isPrime(int n){
            if (n<0) return false;

            if(n==2||n==3||n==5||n==7) return true;

            if (n%2==0||n%3==0||n%5==0||n%7==0){
                return false;
            }else {
                return true;
            }
        }
    }

