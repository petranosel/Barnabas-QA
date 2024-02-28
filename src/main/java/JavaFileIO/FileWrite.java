package JavaFileIO;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.File;
import java.io.FileDescriptor;

public class FileWrite {
    public static void main(String[] args) {
        String filePath  =  "C:/Users/meedh/OneDrive/Desktop";
        File dsktopDirectory =new File(filePath);

        File OutputFile = new File(dsktopDirectory,"myFile.txt");
        try{
            OutputStream outputStream = new FileOutputStream(OutputFile);

            String data = "This is the file i wrote from java";
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);

            outputStream.close();
            System.out.println("file written to the given path");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }



}
