package FileHandle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffRead {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("No file here");
            e.printStackTrace();
        }
    }
}
