import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question11 {

    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length()!= str2.length()) {
            return false; // Cannot be anagrams if lengths are different or either string is null
        }

        Map<Character, Integer> charCounts = new HashMap<>();

        // Count character frequencies in str1
        for (int i = 0; i < str1.length(); i++) {
            char c = Character.toLowerCase(str1.charAt(i)); // Case-insensitive
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Decrement counts for characters in str2
        for (int i = 0; i < str2.length(); i++) {
            char c = Character.toLowerCase(str2.charAt(i)); // Case-insensitive
            charCounts.put(c, charCounts.getOrDefault(c, 0) - 1);
            if (charCounts.get(c) < 0) {
                return false; // If count goes negative, not an anagram
            }
        }

        // Check if all counts are zero (meaning all characters matched)
        for (int count: charCounts.values()) {
            if (count!= 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
        scanner.close();
    }
}