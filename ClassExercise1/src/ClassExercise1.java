import java.util.Scanner;
public class ClassExercise1 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter your weight in grams to be converted into kilograms: ");
        float weight = input1.nextFloat();  // Read user input
        double new_weight=weight*0.001;
        System.out.println(weight+ " Grams converted to Kilograms is " + new_weight+" Kg");



        Scanner input2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter your distance in meters to be converted into kilometers: ");
        float distance = input2.nextFloat();  // Read user input
        double new_distance=distance*0.001;
        System.out.println(distance+ " meters converted to Kilometers is " + new_distance+" Km");


        Scanner input3 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter your temperature in Celsius to be converted into Farenheit: ");
        float celsius = input3.nextFloat();  // Read user input
        double fahrenheit=(celsius)*(9.0/5.0)+32;
        System.out.println(celsius+ "C\u00B0 celsius converted to fahrenheit is " + fahrenheit+"F\u00B0");
    }
}
