import java.util.Scanner;
//Name: Riley Kelm
//Date March 9th 2025
//Description: A two player bowling game that tracks scores and finds a winner
public class Assignment3 {
    //Creates the input scanner
    private static Scanner input = new Scanner((System.in));
    //creates a 2d array that track what type of score was on each fram
    static float[][] game = new float[12][1];



//the getScore function that takes the number of what frame it and what player it is returning their score for the round
    public static int getScore(String name, int frame){
        //a boolean in charge of a while loop
        boolean check=false;
    System.out.println("Please enter your score "+name + " for frame "+(frame+1));

    //Checks for type validation
    while (!input.hasNextInt()){
        System.out.println("Please input a proper interger score between 0 and 10");
        input.next();
        }
    int score=input.nextInt();

    //a loop that checks that validates if the score is between 0 and 10
    while (check==false){
        if (score>10|| score<0){
            System.out.println("Please input a proper interger score between 0 and 10");
            score=input.nextInt();
        }else {
            check=true;
        }
    }
    return score;
}
//getTurnScore function that takes in the frame and player name
public static int getTurnScore(int frame, String name){
        //initializes the score by calling the getScore method score2 and check variables
    int score=getScore(name,frame);
    int score2=0;
    int check=1;

    //checks if the score was a strike if so set that frames variable to 1 in the game array
    if (score==10) {
        game[frame][0]=1;

        //if the score is less then 10 ask for second score
    } else if (score<10 ) {

        score2=getScore(name,frame);

        // a while loop that checks that the combination of score and score2 is less then 11
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
    //Checks if the frame was a spare or not and assigns the appropriate value to the game array
    if (score==10 && check==2){
        game[frame][0]=2;
    } else if (score<10) {
        game[frame][0]=3;

    }

    return score;
}


//getGameScore that only takes in player name
public  static int [] getGameScores(String name){
        //creates a array with 12 blanks elements
        int [] scorelist=new int [12];

    //fills the array with 10 elements from the getTurnScore function
    for (int x = 0; x < 10; x++ ){

        scorelist[x]=getTurnScore(x,name);

    }//checks if the final frame is a strike if so they get two more frames and adds them to the scorelist
if (game[9][0]==1){

    scorelist[10]= getTurnScore(10,name);
    scorelist[11]= getTurnScore(11,name);
    //Does the same thing as above but only adding one for strikes
} else if (game[9][0]==2) {
    scorelist[10]=  getTurnScore(10,name);
}
    // a for loop that adds the additional points for it they got a strike or a spare
    for (int x = 0; x < 10; x++ ){
    if (game[x][0]==1) {

        scorelist[x] = scorelist[x] + scorelist[x + 1] + scorelist[x + 2];
    } else if (game[x][0]==2) {
        scorelist[x] = scorelist[x] + scorelist[x + 1];
    }
    }


    return scorelist;
}


    public static void main(String[] args) {
        // a variable that controls the main loop
        String play = "1";
        while (play.equals("1")) {
            //asks the players for their names
            System.out.println("Please enter Player ones name: ");
            String playerone = input.next();
            System.out.println("Please enter Player twos name: ");
            String playertwo = input.next();
            //initializes the players scores to 0
            int playerone_total_score = 0;
            int playertwo_total_score = 0;
            //Creates 2 arrays for that are equal to the getGameScores returned arrays
            int[] playerone_score = getGameScores(playerone);
            int[] playertwo_score = getGameScores(playertwo);
            System.out.println("        " + playerone + "            " + playertwo);

            //a for loop that displays the points per frame and addthe overall points
            for (int x = 0; x < 10; x++) {
                playerone_total_score += playerone_score[x];
                playertwo_total_score += playertwo_score[x];
                System.out.println("Frame:" + (x + 1) + " " + playerone + " scored :" + playerone_score[x] + " " + playertwo + " scored: " + playertwo_score[x]);

            }

            System.out.println("Overall points:" + playerone + ": " + playerone_total_score+ " and "+playertwo+": "+playertwo_total_score);
            //Checks who wom, who lost and if there were draws
            if (playerone_total_score > playertwo_total_score) {
                System.out.println(playerone + " wins!!!!!!!!1");
            } else if (playerone_total_score < playertwo_total_score) {
                System.out.println(playertwo + " wins!!!!!!!!");
            } else {
                System.out.println("Its a Draw!!!!!");
            }

            //Asks the user if they want to play again if no the program closes
            System.out.println("Would you like to play again press 1 if so press anything else to quit");
            play=input.next();
        }
    }
}
