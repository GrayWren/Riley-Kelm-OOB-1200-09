import java.util.Scanner;

public class Assignment3 {
    private static Scanner input = new Scanner((System.in));
    static float[][] game = new float[9][4];




    public static int getScore(String name){
        boolean check=false;
    System.out.println("Please enter your score "+name);
    while (!input.hasNextInt()){
        System.out.println("Please input a proper interger score between 0 and 10");
        input.next();
        }
    int score=input.nextInt();
    while (check=false){
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
    int score=getScore(name);
    int score2=0;
    int check=1;
    if (score==10) {
        game[frame][1]=1;

    } else if (score<10 ) {
        System.out.println("2");
        score2=getScore(name);
        while (check==1){
            if (score+score2>10){
                System.out.println("You could not have scored over 10 points");
                score2=getScore(name);
            }else {
                score+=score2;
                check=2;
            }
        }

    }
    if (score==10){
        game[frame][1]=2;
    } else if (score<10) {
        game[frame][1]=3;

    }

    return score;
}



public  static int [] getGameScores(String name){
        int [] scorelist=new int [12];
    System.out.println("pog");
    for (int x = 0; x < 10; x++ ){
        scorelist[x]=getTurnScore(x,name);
    }


    return scorelist;
}


    public static void main(String[] args) {

        System.out.println("Please enter Player ones name: ");
        String playerone=input.nextLine();
        System.out.println("Please enter Player twos name: ");
        String playertwo=input.nextLine();


        for (int x = 0; x < 10; x++ ){
            System.out.println(getGameScores(playerone));
        }
    }
}
