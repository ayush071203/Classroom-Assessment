import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] employeeIDs) {
        int n = employeeIDs.length;
        for (int i = 1; i < n; i++) {
            int key = employeeIDs[i];
            int j = i - 1;
            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j = j - 1;
            }
            employeeIDs[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();
        int[] employeeIDs = new int[n];
        
        System.out.println("Enter the employee IDs: ");
        for (int i = 0; i < n; i++) {
            employeeIDs[i] = scanner.nextInt();
        }
        
        insertionSort(employeeIDs);

        System.out.print("Sorted employee IDs: ");
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }

    }
}
