package Assignment4;

import java.util.Scanner;

public class Turn extends Throw{
private int throw_one;
private int throw_two;
private int score;
private static Scanner input = new Scanner((System.in));
public static  int check=1;

    private int throw_oneGet(){
    return throw_one;
}
private void throw_oneSet(int x){
    if (x>10){
        System.out.println("You cant have thrown a throw larger then 10");
    }else if (x<0){
        System.out.println("You cant have thrown a negtive number");

    }else {
        this.throw_one=x;
        check=0;
    }
}
public int throw_twoGet(){
        return throw_two;
    }
    public void throw_twoSet(int x){
        this.throw_two=x;
    }
 public int scoreGet(){
    return this.score;
 }

public void scoreSet(int x){
    this.score=x;
}

public void scoreGrabber(){


    while (check==1){
        System.out.println("Please input how many pins were knocked down in throw one");
        while (!input.hasNextInt()){
            System.out.println("Please input a proper interger ");
            input.next();
        }
        throw_oneSet(input.nextInt());
    }
    check=1;


    pinSet(10-throw_oneGet());

    if (pinGet()>0){
        System.out.println("Please input how many pins were knocked down out of the "+pinGet()+" remaining");
        while (!input.hasNextInt()){
            System.out.println("Please input a proper interger ");
            input.next();
        }
        throw_twoSet(input.nextInt());

        while (check==1){
            if (throw_twoGet()>pinGet()){
                System.out.println("You cant have knocked down more pins then there are liar");
                System.out.println("Please input how many pins were knocked down on your second throw");
                while (!input.hasNextInt()){
                    System.out.println("Please input a proper interger ");
                    input.next();
                }
                throw_twoSet(input.nextInt());
            }else {
                check=0;
                scoreSet(throw_oneGet()+throw_twoGet());
            }

        }
    }else {
        scoreSet(throw_oneGet()+throw_twoGet());

        isStrikeSet(true);
    }
    if (scoreGet()==10&&throw_twoGet()!=0){
        isSpareSet(true);
    }
    pinSet(10);
    check=1;
}

    public static void main(String[] args) {


    }






}
