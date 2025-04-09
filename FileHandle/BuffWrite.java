package FileHandle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffWrite {
    public static void main(String[] args) {
        try {
            BufferedWriter bw= new BufferedWriter(new FileWriter("myfile.txt"));
            bw.write("This isnt a sample text");
            bw.close();
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
