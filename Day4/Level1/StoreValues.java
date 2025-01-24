import java.util.*;
class StoreValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number: ");
            double number = input.nextDouble();
            if (number <= 0 || index == 10) break;

            numbers[index] = number;
            index++;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            total += numbers[i];
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum of numbers: " + total);
    }
}
