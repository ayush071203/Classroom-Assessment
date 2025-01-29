import java.util.Scanner;

public class Question12 {

    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        if (sentence == null || wordToReplace == null || replacementWord == null) {
            return sentence; // Handle null inputs gracefully
        }

        String regex = "\\b" + wordToReplace + "\\b"; 
        return sentence.replaceAll(regex, replacementWord);

    }

    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacementWord = scanner.nextLine();

        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);
        System.out.println("Modified sentence: " + modifiedSentence);

        scanner.close();
    }
}