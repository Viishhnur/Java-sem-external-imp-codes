import java.io.*;

public class DataInpStream {
    public static void main(String[] args) {
        int sum = 0;
        try {
            FileInputStream fis = new FileInputStream("numbers.txt");
            DataInputStream dis = new DataInputStream(fis);

            try {
                while (true) {
                    int ch = dis.readInt(); // Read the next integer
                    sum += ch;
                    System.out.println(ch);
                }
            } catch (EOFException e) {
                // EOFException is expected when reaching the end of the file, so no need to print the stack trace.
                System.out.println("reached EOF");
            } finally {
                dis.close(); // This will automatically close the FileInputStream as well
                System.out.println("Sum = " + sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
