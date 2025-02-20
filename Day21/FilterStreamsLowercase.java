import java.io.*;

public class FilterStreamsLowercase {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }
            
            System.out.println("File conversion completed. All uppercase letters have been converted to lowercase.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}