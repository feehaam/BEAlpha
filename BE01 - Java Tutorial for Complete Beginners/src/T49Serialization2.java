import java.io.*;
import java.util.*;
import java.util.logging.*;

public class T49Serialization2 {
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
    
    static void write(Object ... o){
        try(FileOutputStream fos = new FileOutputStream("src/applied.bin")){
            
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(Object obj: o)
                oos.writeObject(obj);
            
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
            
            while(true){
                try{
                    o = (Applied) ois.readObject();
                }
                catch(RuntimeException re){
                    ois.close();
                    return;
                }
                System.out.println(o);
            }
            
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        } catch (ClassNotFoundException ex) {
            
        }
    }
}
