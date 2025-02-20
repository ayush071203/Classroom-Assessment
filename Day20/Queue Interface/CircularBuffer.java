public class CircularBuffer {
    private int[] buffer;
    private int front, rear, size, capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.front = this.rear = this.size = 0;
    }

    public void insert(int value) {
        if (size == capacity) {
            front = (front + 1) % capacity; 
        } else {
            size++;
        }

        buffer[rear] = value;

        rear = (rear + 1) % capacity;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Buffer is empty.");
            return;
        }

        System.out.print("Buffer: [");
        int count = size;
        int i = front;
        while (count > 0) {
            System.out.print(buffer[i] + (count == 1 ? "" : ", "));
            i = (i + 1) % capacity; 
            count--;
        }
        System.out.println("]");
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3); 

        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.display(); 
        buffer.insert(4);
        buffer.display(); 

        buffer.insert(5);
        buffer.display(); 
    }
}
