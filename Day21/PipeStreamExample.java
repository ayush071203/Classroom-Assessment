import java.io.*;

class PipeWriter implements Runnable {
    private PipedOutputStream pipedOutputStream;
    
    public PipeWriter(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }
    
    @Override
    public void run() {
        try {
            String message = "Hello from the writer thread!";
            pipedOutputStream.write(message.getBytes());
            pipedOutputStream.close();
            System.out.println("Writer Thread: Data written to pipe.");
        } catch (IOException e) {
            System.out.println("Writer Thread: Error writing to pipe.");
            e.printStackTrace();
        }
    }
}

class PipeReader implements Runnable {
    private PipedInputStream pipedInputStream;
    
    public PipeReader(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }
    
    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = pipedInputStream.read(buffer)) != -1) {
                System.out.println("Reader Thread: Data received - " + new String(buffer, 0, bytesRead));
            }
            pipedInputStream.close();
        } catch (IOException e) {
            System.out.println("Reader Thread: Error reading from pipe.");
            e.printStackTrace();
        }
    }
}

public class PipeStreamExample {
    public static void main(String[] args) {
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        
        try {
            pipedOutputStream.connect(pipedInputStream);
            
            Thread writerThread = new Thread(new PipeWriter(pipedOutputStream));
            Thread readerThread = new Thread(new PipeReader(pipedInputStream));
            
            writerThread.start();
            readerThread.start();
            
            writerThread.join();
            readerThread.join();
            
        } catch (IOException | InterruptedException e) {
            System.out.println("Main Thread: Error occurred.");
            e.printStackTrace();
        }
    }
}
