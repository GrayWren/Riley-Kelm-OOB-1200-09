package polymor;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal cat = new Cat();
        Animal cow  = new Cow();
        a.sound();
        cat.sound();
        cow.sound();
    }

}
