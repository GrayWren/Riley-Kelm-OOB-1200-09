import java.util.Scanner;
public class Switch {
    private static Scanner inp= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the value");
        int n;
        n=inp.nextInt();
        switch(n){
            case 1:
                System.out.println("This is monday");
                break;
            case 2:
                System.out.println("This is Tuesday");
                break;
            case 3:
                System.out.println("This is wednesday");
                break;
            case 4:
                System.out.println("This is Thursday");
                break;
            case 5:
                System.out.println("This is friday");
                break;
            case 6:
                System.out.println("This is saturday");
                break;
            case 7:
                System.out.println("This is sunday");
                break;
        }


    }
}
