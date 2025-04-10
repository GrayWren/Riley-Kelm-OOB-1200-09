package FileHandle;

public class MyWorld extends Thread{
    public static void main(String[] args) {
        MyWorld mm= new MyWorld();
        mm.start();
        System.out.println("This is outside the thread");

    }
    public void run(){
        super.run();
        System.out.println("Running inside thread");
    }
}
