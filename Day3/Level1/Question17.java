import java.util.*;
class Question17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();
        double bonus = (yearsOfService > 5) ? salary * 0.05 : 0.0;
        System.out.println("Bonus amount: " + bonus);
    }
}