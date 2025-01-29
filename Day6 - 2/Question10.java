import java.util.Scanner;

public class Question10 {

    public static String removeCharacter(String str, char charToRemove) {
        if (str == null || str.isEmpty()) {
            return str; // Handle null or empty input
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != charToRemove) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0); // Read a single character

        String modifiedString = removeCharacter(inputString, charToRemove);
        System.out.println("Modified String: " + modifiedString);
        scanner.close();
    }
}