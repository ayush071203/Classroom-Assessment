import java.util.*;

public class RotateList {
    public static void rotateList(List<Integer> list, int positions) {
        int n = list.size();
        positions = positions % n; 

        reverseList(list, 0, positions - 1);  
        reverseList(list, positions, n - 1);  
        reverseList(list, 0, n - 1);          
    }

    private static void reverseList(List<Integer> list, int start, int end) {
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;

        System.out.println("Original List: " + list);
        rotateList(list, rotateBy);
        System.out.println("Rotated List: " + list);
    }
}
