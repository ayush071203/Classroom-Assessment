import java.util.*;

public class GenerateBinaryNumbers {

    public static List<String> generateBinaryNumbers(int n) {
        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();

        queue.add("1");

        for (int i = 0; i < n; i++) {
            String current = queue.poll();
            result.add(current);

            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        List<String> binaryNumbers = generateBinaryNumbers(n);
        System.out.println("First " + n + " binary numbers: " + binaryNumbers);
    }
}
