package FileHandle;

import java.io.File;
import java.io.IOException;

public class Path {
    public static void main(String[] args) {
        try {
            File myobj= new File("C:\\OOB-1200-09\\week8\\file2.txt");
            if(myobj.createNewFile()){
                System.out.println("File Created: "+myobj.getName());
                System.out.println("Absolute path: "+myobj.getAbsolutePath());
            }else {
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
