package ClassExercise3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Player {
    private String name;
    private int score;
    private int wins;
    public int turn;
    public int game;
    private static Scanner input = new Scanner((System.in));

    public String toString(int number) {
        String newnumber = String.valueOf(number);


        return newnumber;
    }


    public String nameGetter() {
        return name;
    }

    public void nameSetter(String x) {
        name = x;
        this.name = name;
    }

    public int scoreGetter() {
        return score;
    }

    public void scoreSetter(int a) {
        try {
            score = a;
        } catch (IllegalArgumentException e) {
            System.out.println("YOU CANT DONT THAT");
        }
        if (score<0){
            throw new IllegalArgumentException();

        }
        this.score = score;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        try {
            this.wins = wins;
        } catch (IllegalArgumentException e) {
            System.out.println("YOU CANT DONT THAT");
        }
        if(wins<0){
            throw new IllegalArgumentException();
        }
    }


    public static void main(String[] args) {

        int check = 0;
        String player1 = "";
        String player2="";
        String score1="501";
        String score2="501";
        String wins1;
        String wins2;
        Player s = new Player();

        while (check == 0) {
            System.out.println("Please input the name for player one");
            s.nameSetter(input.nextLine());
            player1 = s.nameGetter();
            if (player1 == "") {
                System.out.println("You cant have a blank name");
            } else {
                check = 1;
            }


        }
        check = 0;
        while (check == 0) {
            System.out.println("Please input the name for player two");
            s.nameSetter(input.nextLine());
            player2 = s.nameGetter();
            if (player2 == "") {
                System.out.println("You cant have a blank name");
            } else {
                check = 1;
            }
        }
        check=0;
        System.out.println(player1 + "  " + player2);



        while (check==0){
            System.out.println("Please input player ones score ");
            while (!input.hasNextInt()){
                System.out.println("Please input a valid integer");
                input.next();
            }
            s.scoreSetter(input.nextInt());
            score1= s.toString(s.scoreGetter());
            check=1;
        }
        check=0;
        while (check==0){
            System.out.println("Please input player two score ");
            while (!input.hasNextInt()){
                System.out.println("Please input a valid integer");
                input.next();
            }
            s.scoreSetter(input.nextInt());
            score2= s.toString(s.scoreGetter());
            check=1;
        }
        check=0;
        while (check==0){
            System.out.println("Please input player ones wins ");
            while (!input.hasNextInt()){
                System.out.println("Please input a valid integer");
                input.next();
            }
            s.setWins(input.nextInt());
            wins1= s.toString(s.getWins());
            check=1;
        }
        check=0;
        while (check==0){
            System.out.println("Please input player two wins ");
            while (!input.hasNextInt()){
                System.out.println("Please input a valid integer");
                input.next();
            }
            s.setWins(input.nextInt());
            wins2= s.toString(s.getWins());
            check=1;
        }
    }

}
