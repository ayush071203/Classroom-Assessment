import java.util.HashSet;
import java.util.Set;

public class CheckSubset {
    public static boolean isSubset(Set<Integer> subset, Set<Integer> mainSet) {
        return mainSet.containsAll(subset); 
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println("Is set1 a subset of set2? " + isSubset(set1, set2));
    }
}
