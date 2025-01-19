import java.util.*;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.printf("The volume is"+ volume);
    }
}
