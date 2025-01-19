import java.util.*;
public class Temperature{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double cel = sc.nextDouble();
	double far = (cel*9/5) + 32;
	System.out.print(far);
}
}