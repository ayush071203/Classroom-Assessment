//2.
import java.util.HashSet;

public class PairWithTargetSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 10};
        int target = 14;

        System.out.println(hasPairWithSum(arr, target) ? "Pair found" : "No pair found");
    }
}
