
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class T39FilesUsingFileReader {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("src/input.txt");
        
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        
        while(br.readLine() != null){
            line = br.readLine();
            System.out.println(line);
        } 
        
        try{
            br.close();
        }
        catch(IOException ioe){System.out.println("Error closing.");}
    }
    
}
