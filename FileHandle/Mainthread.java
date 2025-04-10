package FileHandle;

public class Mainthread extends Thread{
    public static int amount=0;
    public static void main(String[] args) {
        Mainthread thread= new Mainthread();
        thread.start();
        while (thread.isAlive()){
            System.out.println("Waiting....");
        }
        System.out.println("Main: "+amount);
        amount++;
        System.out.println("Main: "+amount);
    }
    public void run(){
        amount++;
    }
}
