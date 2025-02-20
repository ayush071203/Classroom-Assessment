import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String filePath = "sample.txt";
        Map<String, Integer> wordCountMap = countWordFrequency(filePath);
        System.out.println(wordCountMap);
    }

    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase();
                line = line.replaceAll("[^a-zA-Z0-9\\s]", "");
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file reader: " + e.getMessage());
            }
        }
        
        return wordCountMap;
    }
}
