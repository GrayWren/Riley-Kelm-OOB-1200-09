package inher;

public class Car extends Vehical{
    private String modelname="Mazda";

    public static void main(String[] args) {
        Car c=new Car();
        c.speed();
        System.out.println(c.name+c.modelname);
    }
}
