import java.util.Scanner;

public class Question7 {

    public static String toggleCase(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Handle null or empty input
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c); // Keep other characters as they are (numbers, symbols, etc.)
            }
        }

        return sb.toString();
    }

    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String toggledString = toggleCase(inputString);
        System.out.println("Toggled string: " + toggledString);
        scanner.close();
    }
}