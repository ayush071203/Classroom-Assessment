import java.util.*;
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] results = new int[10];

        for (int i = 1; i <= 10; i++) {
            results[i - 1] = number * i;
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + results[i]);
        }
    }
}
