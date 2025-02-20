import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2); 

        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2); 

        unionSet.removeAll(intersectionSet); 
        return unionSet;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Symmetric Difference: " + symmetricDifference(set1, set2));
    }
}
