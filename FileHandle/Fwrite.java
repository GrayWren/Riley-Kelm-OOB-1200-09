package FileHandle;

import java.io.FileWriter;
import java.io.IOException;

public class Fwrite {
    public static void main(String[] args) {
        try {
            FileWriter fw= new FileWriter("yourFile.txt");
            fw.write("Hello how are you");
            fw.close();
            System.out.println("Successfully witten to the file");
        }catch (IOException e){
            System.out.println("error found");
            e.printStackTrace();
        }
    }
}
