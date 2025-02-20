import java.io.*;

public class ReadLargeFile {
    public static void main(String[] args) {
        String filePath = "largeflie.dat";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
