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
    }else {
        this.throw_one=x;
        check=0;

    }
    System.out.println("pog");
}
private int throw_twoGet(){
        return throw_two;
    }
    private void throw_twoSet(int x){
        this.throw_two=x;
    }
 private int scoreGet(){
    return score;
 }

private void scoreSet(int x){
    score=x;
}

    public static void main(String[] args) {
        Throw s= new Throw();
        Turn t = new Turn();

        while (check==1){
        System.out.println("Please input how many pins were knocked down in throw one");
        while (!input.hasNextInt()){
            System.out.println("Please input a proper interger ");
            input.next();
        }
            t.throw_oneSet(input.nextInt());
        }
        check=1;
        System.out.println("2");


        s.pinSet(10-t.throw_oneGet());
        System.out.println(s.pinGet());
        if (s.pinGet()>0){
            System.out.println("Please input how many pins were knocked down out of the "+s.pinGet()+" remaining");
            while (!input.hasNextInt()){
                System.out.println("Please input a proper interger ");
                input.next();
            }
            t.throw_twoSet(input.nextInt());

           // s.pinSet(s.pinGet()-t.throw_twoGet());
            while (check==1){
                if (t.throw_twoGet()>s.pinGet()){
                    System.out.println("You cant have knocked down more pins then there are liar");
                    System.out.println("Please input how many pins were knocked down on your second throw");
                    while (!input.hasNextInt()){
                        System.out.println("Please input a proper interger ");
                        input.next();
                    }
                    t.throw_twoSet(input.nextInt());
                }else {
                    check=0;
                    t.scoreSet(t.throw_oneGet()+t.throw_twoGet());
                }

            }
        }else {
            t.scoreSet(t.throw_oneGet()+t.throw_twoGet());

            s.isStrikeSet(true);
            System.out.println("stri");
        }
        if (t.scoreGet()==10&&t.throw_twoGet()!=0){
            System.out.println("spare");
            s.isSpareSet(true);
        }
        s.pinSet(10);
        System.out.println(t.scoreGet());
    }






}
