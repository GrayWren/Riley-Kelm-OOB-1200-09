import java.util.Scanner;

public class Assignment1 {
    private static Scanner input = new Scanner((System.in));
    public static void main(String[] args) {
        boolean height_checker=false;
        boolean weight_checker=false;
        System.out.println("Please input your height: ");
        Float height = input.nextFloat();
        while (height_checker==false){
                if (24>height || height>120){
                    System.out.println("Please input a height between 24 and 120 inches");
                    height=input.nextFloat();
                } else {
                    height_checker=true;
                    System.out.println("pog");
            }
        }
        System.out.println("Please input your weight: ");
        Float weight = input.nextFloat();
        while (weight_checker==false){
            if (weight<25){
                System.out.println("Please input a weight that is greater then 25 pounds: ");
                weight=input.nextFloat();
            }else {
                weight_checker=true;
                System.out.println("pag");
            }
        }




    }
}
