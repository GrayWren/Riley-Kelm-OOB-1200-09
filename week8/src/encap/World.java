package encap;

public class World {
    private int rollno;
    private String name;
    public int age;

    public void hello(){
        System.out.println("Hello");
    }

    public void setter(int x,String nm){
        rollno=x;
        name=nm;
    }

    public void getter(){
        System.out.println("The name is "+name+" and the roll no. is "+rollno);
    }




}
