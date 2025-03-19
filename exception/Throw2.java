package exception;

public class Throw2 {
    public static void main(String[] args) {
        try {
            validateAge(15);
        }catch (IllegalArgumentException e){
            System.out.println("Invalid age: "+e.getMessage());
        }
    }

    static void validateAge(int age) throws IllegalArgumentException{
        if (age<18){
            throw new IllegalArgumentException("Age must at least be 18");
        }
    }
}
