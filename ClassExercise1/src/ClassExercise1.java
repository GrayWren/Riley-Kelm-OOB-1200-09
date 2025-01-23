import java.util.Scanner;
public class ClassExercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter your weight in grams to be converted into kilograms: ");


        float weight = input.nextFloat();  // Read user input
        double new_weight=weight/1000;

        System.out.println(weight+ "Grams converted to Kilograms is " + new_weight+" Kg");  // Output user input
    }
}
