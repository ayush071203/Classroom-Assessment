import java.util.Scanner;

public class Question5 {

    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return ""; // Handle null or empty input
        }

        String[] words = sentence.split("\\s+"); // Split the sentence into words using whitespace as delimiter

        String longestWord = "";
        for (String word : words) {
            // Remove punctuation from the word (optional, but often desirable)
            word = word.replaceAll("[^a-zA-Z]", ""); // Remove non-alphabetic characters

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String longest = findLongestWord(inputSentence);
        System.out.println("The longest word is: " + longest);
        scanner.close();
    }
}