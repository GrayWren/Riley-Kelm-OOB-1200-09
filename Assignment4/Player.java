package Assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player extends Turn{

        private String name;
        private int score=0;
        private int wins1;
        private int wins2;
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



        public int getWins() {
            return wins1;
        }

        public void setWins(int wins) {
            try {
                this.wins1 = wins;
            } catch (IllegalArgumentException e) {
                System.out.println("YOU CANT DONT THAT");
            }
            if(wins<0){
                throw new IllegalArgumentException();
            }
        }

    public int getWins2() {
        return wins2;
    }

    public void setWins2(int wins) {
        try {
            this.wins2 = wins;
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
            ClassExercise3.Player s = new ClassExercise3.Player();
            Turn t=new Turn();
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
            for (int x = 0; x < 10; x++) {
                System.out.println("Turn "+x+" for "+ player1);
                t.main(args);
                

            }




        }

    }


