import java.util.Scanner;

public class Question6 {

    public static int countSubstringOccurrences(String text, String substring) {
        if (text == null || substring == null || substring.isEmpty()) {
            return 0; // Handle null or empty input
        }

        int count = 0;
        int index = 0;

        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move past the current occurrence
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        System.out.print("Enter the substring to search for: ");
        String substring = scanner.nextLine();

        int occurrences = countSubstringOccurrences(text, substring);

        System.out.println("The substring \"" + substring + "\" occurs " + occurrences + " times in the text.");
        scanner.close();
    }
}