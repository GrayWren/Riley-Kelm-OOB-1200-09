package exception;

public class Exp2 {
    public static void main(String[] args) {
        int [] a={1,2,3};
        try {
            System.out.println(a[10]);

        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bounds exceptions "+ e.getMessage());
        }
    }
}
