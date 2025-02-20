import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        String fileName = "user_data.txt";
        
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(fileName, true)) {
            
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            
            System.out.print("Enter your age: ");
            String age = reader.readLine();
            
            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();
            
            String userData = "Name: " + name + ", Age: " + age + ", Favorite Language: " + language + "\n";
            writer.write(userData);
            
            System.out.println("Data saved successfully to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}