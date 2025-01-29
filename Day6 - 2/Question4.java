import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Question4 {

    public static String removeDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Handle null or empty input
        }

        Set<Character> uniqueChars = new LinkedHashSet<>(); // Use LinkedHashSet to maintain order
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (uniqueChars.add(c)) { // add() returns true if the element is new
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String result = removeDuplicates(inputString);
        System.out.println("String with duplicates removed: " + result);
        scanner.close();
    }
}