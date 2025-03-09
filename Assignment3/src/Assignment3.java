import java.util.Scanner;

public class Assignment3 {
    private static Scanner input = new Scanner((System.in));
    static float[][] game = new float[12][1];




    public static int getScore(String name, int frame){
        boolean check=false;
    System.out.println("Please enter your score "+name + " for frame "+(frame+1));
    while (!input.hasNextInt()){
        System.out.println("Please input a proper interger score between 0 and 10");
        input.next();
        }
    int score=input.nextInt();
        System.out.println(score);
    while (check==false){
        System.out.println("check");
        if (score>10|| score<0){
            System.out.println("Please input a proper interger score between 0 and 10");
            score=input.nextInt();
        }else {
            check=true;
        }
    }
    return score;
}

public static int getTurnScore(int frame, String name){
    int score=getScore(name,frame);
    int score2=0;
    int check=1;
    if (score==10) {
        System.out.println("coolio");
        game[frame][0]=1;

    } else if (score<10 ) {

        score2=getScore(name,frame);
        while (check==1){
            if (score+score2>10){
                System.out.println("You could not have scored over 10 points");
                score2=getScore(name,frame);
            }else {
                score+=score2;
                check=2;
            }
        }

    }
    if (score==10 && check==2){
        game[frame][0]=2;
    } else if (score<10) {
        game[frame][0]=3;

    }
    System.out.println("get turn");
    return score;
}



public  static int [] getGameScores(String name){
        int [] scorelist=new int [12];
    System.out.println("pog");

    for (int x = 0; x < 10; x++ ){

        scorelist[x]=getTurnScore(x,name);

    }
if (game[9][0]==1){
    System.out.println("cooldog");
    scorelist[10]= getTurnScore(10,name);
    scorelist[11]= getTurnScore(11,name);
} else if (game[9][0]==2) {
    scorelist[10]=  getTurnScore(10,name);
}

    for (int x = 0; x < 10; x++ ){
    if (game[x][0]==1) {

        scorelist[x] = scorelist[x] + scorelist[x + 1] + scorelist[x + 2];
    } else if (game[x][0]==2) {
        scorelist[x] = scorelist[x] + scorelist[x + 1];
    }
    }

    System.out.println(scorelist[0]);
    System.out.println("GetGame");
    return scorelist;
}


    public static void main(String[] args) {
        String play = "1";
        while (play.equals("1")) {
            System.out.println("Please enter Player ones name: ");
            String playerone = input.next();
            System.out.println("Please enter Player twos name: ");
            String playertwo = input.next();
            int playerone_total_score = 0;
            int playertwo_total_score = 0;
            int[] playerone_score = getGameScores(playerone);
            int[] playertwo_score = getGameScores(playertwo);
            System.out.println("        " + playerone + "            " + playertwo);
            for (int x = 0; x < 10; x++) {
                playerone_total_score += playerone_score[x];
                playertwo_total_score += playertwo_score[x];
                System.out.println("Frame:" + (x + 1) + " " + playerone + " scored :" + playerone_score[x] + " " + playertwo + " scored: " + playertwo_score[x]);

            }
            System.out.println("Overall points:" + playerone + ": " + playerone_total_score+" and "+playertwo+": "+playertwo_total_score);
            if (playerone_total_score > playertwo_total_score) {
                System.out.println(playerone + " wins!!!!!!!!1");
            } else if (playerone_total_score < playertwo_total_score) {
                System.out.println(playertwo + " wins!!!!!!!!");
            } else {
                System.out.println("Its a Draw!!!!!");
            }
            System.out.println("Would you like to play again press 1 if so press anything else to quit");
            play=input.next();
        }
    }
}
