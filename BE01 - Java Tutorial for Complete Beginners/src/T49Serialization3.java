import java.io.*;
import java.util.*;
import java.util.logging.*;

public class T49Serialization3 {
    public static void main(String args[]){
        Applied a = new Applied("ABC", Gender.men, 25);
        System.out.println(a);
        Applied b = new Applied("DEF", Gender.woman, 24);
        System.out.println(b);
        Applied c = new Applied("GHI", Gender.other, 5);
        System.out.println(c);
        
        write(a, b, c, b, a, a, c, b, c);
        
        read();
    }
    
    static void write(Applied ... o){
        ArrayList<Applied> ar = new ArrayList<Applied>();
        for(Applied obj: o){
            ar.add(obj);
        }
        try(FileOutputStream fos = new FileOutputStream("src/applied.bin")){
            
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ar);
            oos.close();
            System.out.println("Serialization complete!");
            
        } catch (FileNotFoundException ex) {} 
        catch (IOException ex) {}
    }
    
    static void read(){
        try(FileInputStream fis = new FileInputStream("src/applied.bin")){
            
            System.out.println("\nReading objects: ");
            
            ObjectInputStream ois = new ObjectInputStream(fis);
            Applied o;
            
            ArrayList<Applied> ar = (ArrayList<Applied>)ois.readObject();
            ois.close();
            
            System.out.println("Total items: "+ar.size());
            for(int i=0; i<ar.size(); i++)
                System.out.println(ar.get(i));
            
        } catch (FileNotFoundException ex) { } catch (IOException ex) { } catch (ClassNotFoundException ex) { }
    }
}
