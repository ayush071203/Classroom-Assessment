import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FileReaderExample {
    public static void main(String[] args) {
        File file = new File("data.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
