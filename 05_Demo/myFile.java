package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandle {
    public static void main(String[] args) {
        try {
            File obj = new File("myFile.c");
            if (obj.createNewFile()) {
                System.out.println("File Created: " + obj.getName());
            } else {
                System.out.println("File already exists.");
            }
            System.out.println("Absolute Path: " + obj.getAbsolutePath());

            FileWriter Writer = new FileWriter("myFile.txt");
            Writer.write("I have written this in the file");
            Writer.close();
            System.out.println("Successfully Written");

            Scanner Reader = new Scanner(obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}