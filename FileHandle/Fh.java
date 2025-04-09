package FileHandle;

import java.io.File;
import java.io.IOException;

public class Fh {
    public static void main(String[] args) {
        try{
            File file = new File("file.txt");
            if (file.createNewFile()){
                System.out.println("File Name is: "+ file.getName());
            }else {
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println("Error occurs");
            e.printStackTrace();
        }
    }
}
