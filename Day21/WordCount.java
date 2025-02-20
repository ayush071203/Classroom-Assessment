import java.io.*;
import java.util.*;
import java.util.stream.*;

public class WordCount {
    public static void main(String[] args) {
        // Path to the input text file
        String filePath = "source.txt";
        
        // Create a map to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        // Read the file and count words
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into words using a regex that considers word boundaries
                String[] words = line.split("\\W+");
                
                for (String word : words) {
                    if (!word.isEmpty()) {
                        // Convert the word to lowercase to ensure case-insensitive counting
                        word = word.toLowerCase();
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Sort the words based on frequency (value) in descending order
        List<Map.Entry<String, Integer>> sortedWords = wordCountMap.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .collect(Collectors.toList());

        // Display the top 5 most frequent words
        System.out.println("Top 5 most frequent words:");
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedWords) {
            if (count >= 5) break;
            System.out.println(entry.getKey() + ": " + entry.getValue());
            count++;
        }
    }
}
