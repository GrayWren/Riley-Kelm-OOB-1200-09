import java.util.Scanner;

public class Assignment1 {
    private static Scanner input = new Scanner((System.in));
    public static void main(String[] args) {
        boolean height_checker=false;
        boolean weight_checker=false;

        while (height_checker==false){
                System.out.println("Please input your height: ");
                Float height = input.nextFloat();

                if (24>height || height>120){
                    System.out.println("Please input a height between 24 and 120 inches");
                    input.nextFloat();
                } else {
                    height_checker=true;
                    System.out.println("pog");
            }
        }
        while (weight_checker==false){
            System.out.println("Please input your weight: ");
            Float weight = input.nextFloat();

            if ()
        }




    }
}
