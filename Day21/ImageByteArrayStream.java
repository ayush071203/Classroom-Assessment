import java.io.*;
import java.nio.file.Files;

public class ImageByteArrayStream {
    public static void main(String[] args) {
        String sourceImage = "source.jpg";
        String destinationImage = "copy.jpg";
        
        try {
            // Convert image to byte array
            byte[] imageData = Files.readAllBytes(new File(sourceImage).toPath());
            
            // Write byte array back to a new image file
            try (ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
                 ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                
                int data;
                while ((data = bais.read()) != -1) {
                    baos.write(data);
                }
                
                Files.write(new File(destinationImage).toPath(), baos.toByteArray());
                System.out.println("Image copied successfully.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
