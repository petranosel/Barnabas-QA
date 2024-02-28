package JavaFileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {


    String FilePath = "C:/Users/meedh/OneDrive/Desktop";
        File inputFile = new File( FilePath,"myFile.txt");
        try {
            BufferedReader reader =new BufferedReader(new FileReader(inputFile));
String line;
      while ((line= reader.readLine()) !=null){
          System.out.println(line);
      }

        reader.close();}
        catch ( IOException e){e.printStackTrace();

}}}
