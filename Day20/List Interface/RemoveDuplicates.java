import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);

        System.out.println("Original List: " + list);
        List<Integer> result = removeDuplicates(list);
        System.out.println("List after removing duplicates: " + result);
    }
}
