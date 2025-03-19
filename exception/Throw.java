package exception;

public class Throw {
    static void checkAge(int age) throws IllegalArgumentException{
        if(age<18){
            throw new IllegalArgumentException("Access denied- 18 will be required");
       }else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
