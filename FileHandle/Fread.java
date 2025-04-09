package FileHandle;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Fread {
    public static void main(String[] args) {
        try {
            File myobj= new File("yourFile.txt");
            Scanner myReader= new Scanner(myobj);
            while (myReader.hasNextLine()){
                String data= myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
