import java.util.Scanner;
public class While {
    private static Scanner input = new Scanner((System.in));

    public static void main(String[] args) {
        System.out.println("Please input range");
        int i = input.nextInt();
        System.out.println("Please input another range");
        int b=input.nextInt();
       /* int n = 0;
       /* while (n < i) {
            if (n % 2 == 0) {
                System.out.println("Its even!");
            } else {
                System.out.println("Its odd");
            }*/

            /*do {
                System.out.println(i);
                i++;
            } while (i < 8);*/
            for(int x=0; x<i; x++){
                System.out.println(x);
            }
            for(int c=0; c<b; c++){
                System.out.println(c);
            }

        }


    }
