package Assignment4;

public class Game extends Player {
    private int winner;

    public void setWinner(int x){
        this.winner+=x;
    }

    public int getWinner() {
        return winner;
    }

    public  void gameTime(){
        Player p= new Player();
        for(int x=0;x<3;x++){
            super.playerturns();
            System.out.println(getWins());
            setWinner(getWins());
        }
        if(getWinner()>0){
            System.out.println("Congrats "+ nameGetter1()+" Overall");
        } else if (getWinner()<0) {
            System.out.println("Congrats "+nameGetter2()+ "Overall");

        }else {
            System.out.println("ITS an overall draw");
        }
    }

    public static void main(String[] args) {

    }
}
