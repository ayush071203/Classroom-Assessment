import java.util.Scanner;

public class Question8 {

    public static String compareStrings(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return "Strings are equal."; // Or handle as you prefer
        }
        if (str1 == null) {
            return "String 1 is null."; // Or handle as you prefer
        }
        if (str2 == null) {
            return "String 2 is null."; // Or handle as you prefer
        }


        int i = 0;
        while (i < str1.length() && i < str2.length()) {
            if (str1.charAt(i) < str2.charAt(i)) {
                return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.";
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return "\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order.";
            }
            i++;
        }

        // If we reach here, one string is a prefix of the other
        if (str1.length() < str2.length()) {
            return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.";
        } else if (str1.length() > str2.length()) {
            return "\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order.";
        } else {
            return "Strings are equal.";
        }
    }

    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter String 2: ");
        String str2 = scanner.nextLine();

        String result = compareStrings(str1, str2);
        System.out.println(result);
        scanner.close();
    }
}