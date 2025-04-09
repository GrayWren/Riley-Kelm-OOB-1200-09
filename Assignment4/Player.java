package Assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player extends Turn{

        private String name1;
        private String name2;
        private int wins=0;


        private static Scanner input = new Scanner((System.in));
        static float[][] status = new float[12][4];

        public String toString(int number) {
            String newnumber = String.valueOf(number);


            return newnumber;
        }


        public String nameGetter1() {
            return name1;
        }

        public void nameSetter1(String x) {
            name1 = x;
            this.name1 = x;
        }

    public String nameGetter2() {
        return name2;
    }

    public void nameSetter2(String x) {
        name2 = x;
        this.name2 = name2;
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

        }

    public void playerturns(){
        int check = 0;
        String player1 = "";
        String player2="";
        int score1=0;
        int score2=0;
        ClassExercise3.Player s = new ClassExercise3.Player();
        Turn t=new Turn();

        while (check == 0) {
            System.out.println("Please input the name for player one");
            nameSetter1(input.nextLine());
            player1 = nameGetter1();
            if (player1 == "") {
                System.out.println("You cant have a blank name");
            } else {
                check = 1;
            }


        }
        check = 0;
        while (check == 0) {
            System.out.println("Please input the name for player two");
            nameSetter2(input.nextLine());
            player2 = nameGetter2();
            if (player2 == "") {
                System.out.println("You cant have a blank name");
            } else {
                check = 1;
            }
        }
        check=0;

        //gettign scores
        for (int x = 0; x < 10; x++) {
            //p1
            System.out.println("Turn "+(x+1)+" for "+ player1);
            t.scoreGrabber();

            if (t.isStrikeGet()==true){
                status[x][1]=2;
            } else if (t.isSpareGet()==true) {
                status[x][1]=1;
            }else {
                status[x][1]=0;
            }

            status[x][0]=t.scoreGet();

            t.isSpareSet(false);
            t.isStrikeSet(false);

            //p2
            System.out.println("Turn "+(x+1)+" for "+ player2);
            t.scoreGrabber();
            if (t.isStrikeGet()==true){
                status[x][3]=2;
            } else if (t.isSpareGet()==true) {
                status[x][3]=1;
            }else {
                status[x][3]=0;
            }
            status[x][2]=t.scoreGet();
            t.isSpareSet(false);
            t.isStrikeSet(false);

        }

        //extra turns
        if(status[9][1]==2){
            System.out.println("Turn 11 for "+ player1);
            t.scoreGrabber();
            status[10][0]=t.scoreGet();
            System.out.println("Turn 12 for "+ player1);
            t.scoreGrabber();
            status[11][0]=t.scoreGet();
        } else if (status[9][1]==1) {
            System.out.println("Turn 11 for "+ player1);
            t.scoreGrabber();
            status[11][0]=t.scoreGet();
        }

        if(status[9][3]==2){
            System.out.println("Turn 11 for "+ player2);
            t.scoreGrabber();
            status[10][2]=t.scoreGet();
            System.out.println("Turn 12 for "+ player2);
            t.scoreGrabber();
            status[11][2]=t.scoreGet();
        } else if (status[9][3]==1) {
            System.out.println("Turn 11 for "+ player1);
            t.scoreGrabber();
            status[11][2]=t.scoreGet();
        }

        //for socring
        for (int x=0; x<10; x++){

            if(status[x][1]==2){
                status[x][0]+=status[x+1][0]+status[x+2][0];
            } else if (status[x][1]==1) {
                status[x][0]+=status[x+1][0];
            }

            score1+=status[x][0];

            status[x][0]=0;



            if(status[x][3]==2){
                status[x][2]+=status[x+1][2]+status[x+2][2];
            } else if (status[x][3]==1) {
                status[x][2]=status[x+1][2];
            }
            score2+=status[x][2];
            status[x][2]=0;
//


        }
        status[10][0]=0;
        status[11][0]=0;
        status[10][2]=0;
        status[11][2]=0;



        if (score1>score2){
            System.out.println("Congrats "+player1+ " WINS!!!");
            setWins(1);
        } else if (score1==score2) {
            System.out.println("ITS a DRAW");
            setWins(0);
        }else {
            System.out.println("Congrats "+player2+" WINS");
            setWins(-1);
        }
    }


        public static void main(String[] args) {



        }

    }


