import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// count number of words and lines in a file
public class CountWordsLines {
    private static void WordLineCounter(String fileName){

        int wordCnt = 0;
        int lineCnt = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) != null){
                lineCnt++;
                wordCnt += line.split("\\s+").length;
            }
            System.out.println("Word count = " + wordCnt);
            System.out.println("Line count = " + lineCnt);
        }
        catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }

    }
    public static void main(String[] args){
        
        // take file name using command line args
        if(args.length == 0){
            System.out.println("Usage: java WordLineCounter <filename>");
            return;
        }
        WordLineCounter(args[0]);
    
    }
}
