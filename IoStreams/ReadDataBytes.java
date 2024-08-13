// Write a program to read data byte by byte and prints to console 

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataBytes {
    public static void main(String[] args){
    
        try{
            FileInputStream fis = new FileInputStream("sample.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int ch = 0;
            // read data
            while(true){

                ch = bis.read();
                if(ch == -1) break;
                System.out.print((char)ch);

            }
            fis.close();
            bis.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

/*
 The read() method used in the above program reads one byte of data from the
current file pointer location, returns the equivalent int value and also advances the
file pointer to the next byte.
If there is no more bytes to read from the file, the read() method returns -1.
 */
