package FileHandle;

public class Mynew implements Runnable{
    public static void main(String[] args) {
        Mynew mm= new Mynew();
        Thread th = new Thread(mm);
        th.start();
        System.out.println("outside code");
    }
    public void run(){
        System.out.println("running inside code");
    }
}
