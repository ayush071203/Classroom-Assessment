import java.util.Scanner;

public class KilometerToMilesConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = scanner.nextDouble();
		
        double miles = kilometers * 0.621371;
		
        System.out.printf("Result will be" + miles);

    }
}
