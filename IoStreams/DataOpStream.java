// Data output stream has different write methods to directly write primitive data types to any output stream
// take integer inputs from user and write into a
// import java.io.DataOutputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;
import java.io.*;
import java.util.Scanner;
public class DataOpStream {
    public static void main(String[] args){
        
        int num;
        Scanner sc = new Scanner(System.in);
        try{
            FileOutputStream fos = new FileOutputStream("numbers.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            System.out.println("Enter 5 integers : ");
            for(int i=0;i<5;i++){
                num = sc.nextInt();
                dos.writeInt(num);
            }
            dos.close(); // this will automatically close fos as well

        }
        catch(IOException e){
            e.printStackTrace();
        }  
        finally{
            sc.close();
        }
    
    }
}
