import java.util.*;
class MultiplicationRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] results = new int[4];

        for (int i = 6; i <= 9; i++) {
            results[i - 6] = number * i;
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + results[i]);
        }
    }
}
