package FileHandle;

import java.io.File;
import java.io.IOException;

public class Exist {
    public static void main(String[] args) {
        File obj = new File("file.txt");
        if(obj.exists()){
            System.out.println("File name is: "+obj.getName());
            System.out.println("Absolute path is: "+obj.getAbsolutePath());
            System.out.println("can write "+obj.canWrite());
            System.out.println( "Can read: "+obj.canRead());
            System.out.println("Length: "+obj.length());
        }else {
            System.out.println("not exist");
        }
    }
}
