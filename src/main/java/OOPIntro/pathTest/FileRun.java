package OOPIntro.pathTest;


import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileRun {
    public static void main(String[] args) {

        Path path = Paths.get("files/fileSample.txt");
        String message1 = "I am here in "+ path.toString();

        try {
            if(!Files.exists(path))
                Files.createFile(path);
            try(BufferedWriter writer = Files.newBufferedWriter(path)){
                writer.write(message1);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String pathName = "files/fileSample1.txt";
        String message2 = "I am here in "+ pathName;
        File file = new File(pathName);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(message2);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
