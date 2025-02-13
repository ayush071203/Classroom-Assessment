//1.
import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;

    public QueueUsingStacks() {
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }

    public void enqueue(int value) {
        enqueueStack.push(value);
    }

    public int dequeue() {
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        if (dequeueStack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return dequeueStack.pop();
    }

    public int peek() {
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        if (dequeueStack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return dequeueStack.peek();
    }

    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueUsingStacks queue = new QueueUsingStacks();
        
        while (true) {
            System.out.println("Choose an operation: 1-Enqueue, 2-Dequeue, 3-Peek, 4-Check Empty, 5-Exit");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    try {
                        System.out.println("Dequeued: " + queue.dequeue());
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Front Element: " + queue.peek());
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Is Queue Empty? " + queue.isEmpty());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
