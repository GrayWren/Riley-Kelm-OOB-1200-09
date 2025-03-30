package Assignment4;
import java.util.Scanner;

public class Throw  {
private int pins=10;
private boolean isStrike;
private boolean isSpare;
private static Scanner input = new Scanner((System.in));

    public int pinGet() {
        return pins;
    }

    public void pinSet(int x) {
        this.pins = x;

    }

    public boolean isStrikeGet() {
        return isStrike;
    }

    public void isStrikeSet(boolean x) {
        this.isStrike = x;
    }

    public boolean isSpareGet() {
        return isSpare;
    }

    public void isSpareSet(boolean x) {
        this.isSpare = x;
    }

    public static void main(String[] args) {
//        Throw s= new Throw();
//        System.out.println("Please input how many pins were knocked down");
//        while (!input.hasNextInt()){
//            System.out.println("Please input a proper interger ");
//            input.next();
//        }
//        int knocked= input.nextInt();
//        s.pinSet(10-knocked);
//        if(s.pinGet()==0){
//            s.isStrikeSet(true);
//        }
    }











}


