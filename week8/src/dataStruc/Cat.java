package dataStruc;

public class Cat implements Animal,Animal2{
    @Override
    public void animalSound() {
        System.out.println("animal have different sounds");
    }

    @Override
    public void run() {
        System.out.println("RUN");
    }

    @Override
    public void sleep() {
        System.out.println("zzzzzz");
    }

    @Override
    public void dangerous() {
        System.out.println("RAWR");
    }

    @Override
    public void scary() {
        System.out.println("EEEEEEPP");
    }

    public static void main(String[] args) {
        Cat c= new Cat();
        c.sleep();
        c.animalSound();
        c.run();
        c.scary();
        c.dangerous();
    }
}
