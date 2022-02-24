
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class T37FilesUsingScanner{
    public static void main(String args[]) throws Exception{
        String path = "src/input.txt";
        File textFile = new File(path);
        
        Scanner sc = new Scanner(textFile);
        
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println("Words: "+n);
            while(n-->0){
                System.out.println(sc.next().toUpperCase());
            }
        }
    }
}
