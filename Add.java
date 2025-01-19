import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scanner.nextInt(); // This will throw an InputMismatchException if the input isn't an integer
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();
        System.out.println("The sum is: " + (a + b));
    }
}
