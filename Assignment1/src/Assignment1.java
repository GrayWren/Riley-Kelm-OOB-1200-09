import java.util.Scanner;
/*Name: Riley Kelm
Date: January 30th 2025
Description: Takes input from the user finding their weight and height and using that to find their BMI*/
public class Assignment1 {
    private static Scanner input = new Scanner((System.in));
    public static void main(String[] args) {
        boolean height_checker=false;
        boolean weight_checker=false;
        System.out.println("Please input your height: ");
        Float height = 1.2f;
        while (height_checker==false) {
            height = input.nextFloat();
            if (24 > height || height > 120) {
                System.out.println("Please input a height between 24 and 120 inches");
            } else {
                height_checker = true;
            }
        }

        System.out.println("Please input your weight: ");
        Float weight = 0f;
        while (weight_checker==false){
            weight=input.nextFloat();

            if (weight<25){
                System.out.println("Please input a weight that is greater then 25 pounds: ");

            }else {
                weight_checker=true;
                System.out.println("pag");
            }
        }


    Float bmi=(weight/(height*height))*703;
        if (bmi<16){
            System.out.printf("with a weight of %.2f pounds and a height of %.2f You get a BMI of %.2f which makes you severally underweight",weight,height,bmi);
        } else if (bmi<18.5) {
            System.out.printf("with a weight of %.2f pounds and a height of %.2f You get a BMI of %.2f which makes you underwight",weight,height,bmi);

        } else if (bmi<25) {
            System.out.printf("with a weight of %.2f pounds and a height of %.2f You get a BMI of %.2f which makes you healthy",weight,height,bmi);

        } else if (bmi<30) {
            System.out.printf("with a weight of %.2f pounds and a height of %.2f You get a BMI of %.2f which makes you overweight",weight,height,bmi);

        }else {
            System.out.printf("with a weight of %.2f pounds and a height of %.2f You get a BMI of %.2f which makes you obese",weight,height,bmi);
        }


    }
}
