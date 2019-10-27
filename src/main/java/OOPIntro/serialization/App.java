package OOPIntro.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Period;

public class App {
    static Path dir = Paths.get("serializationDir");
    static Path file = Paths.get("serializationDir"+"/"+"serializationFile");
    static Path file2 = Paths.get("serializationDir"+"/"+"serialization2File");
    static Person p1 = new Person("p1");
    static Person p2 = new Person("p2");
    public static void main(String[] args) {
        //serializing();
        serialization();
        deserialization(file2);
    }

    public static void serializing() {

            if (!Files.exists(dir)) {
                try {
                    Files.createDirectory(dir);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (!Files.exists(file)) {
                try {
                    Files.createFile(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(file))){
                oos.writeObject(p1);
                 oos.writeObject(p2);

            } catch (IOException e) {
                e.printStackTrace();
            }


    }

    public static void deserialization(Path path) {
         try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
                Person p1Copy = (Person) ois.readObject();
                Person p2Copy = (Person) ois.readObject();
                System.out.println(p1Copy);
                System.out.println(p2Copy);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
    }

    public static void serialization(){
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(file));
            ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(file2))){
            Person pTemp1 = (Person) ois.readObject();
            Person pTemp2 = (Person) ois.readObject();
            pTemp1.setName("p Temp1");
            pTemp2.setName("p temp2");
            oos.writeObject(pTemp1);
            oos.writeObject(pTemp2);
            oos.flush();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
