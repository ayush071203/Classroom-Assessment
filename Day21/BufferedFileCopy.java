import java.io.*;

public class BufferedFileCopy {
    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {
        String sourceFile = "largefile.dat";
        String destBuffered = "copy_buffered.dat";
        String destUnbuffered = "copy_unbuffered.dat";

        long startTime = System.nanoTime();
        copyWithBufferedStreams(sourceFile, destBuffered);
        long endTime = System.nanoTime();
        System.out.println("Buffered Streams Time: " + (endTime - startTime) / 1_000_000 + " ms");

        startTime = System.nanoTime();
        copyWithUnbufferedStreams(sourceFile, destUnbuffered);
        endTime = System.nanoTime();
        System.out.println("Unbuffered Streams Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    private static void copyWithBufferedStreams(String source, String destination) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {
            
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("Buffered copy completed.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void copyWithUnbufferedStreams(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("Unbuffered copy completed.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}