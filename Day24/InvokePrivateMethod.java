import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class InvokePrivateMethod {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            Class<?> clazz = calculator.getClass();
            Method multiplyMethod = clazz.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true);

            // Invoking the private method 'multiply'
            int result = (int) multiplyMethod.invoke(calculator, 5, 10);
            System.out.println("Result of multiplication: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
