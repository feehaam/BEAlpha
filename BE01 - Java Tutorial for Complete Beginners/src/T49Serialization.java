//import java.io.*;
//import java.util.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class T49Serialization {
//    public static void main(String args[]){
//        Applied a = new Applied("ABC", Gender.men, 25);
//        System.out.println(a);
//        Applied b = new Applied("DEF", Gender.woman, 24);
//        System.out.println(b);
//        Applied c = new Applied("GHI", Gender.other, 5);
//        System.out.println(c);
//        
//        write(a, b, c);
//        
//        read();
//    }
//    
//    static void write(Object o1, Object o2, Object o3){
//        try(FileOutputStream fos = new FileOutputStream("src/applied.bin")){
//            
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(o1);
//            oos.writeObject(o2);
//            oos.writeObject(o3);
//            
//            oos.close();
//            System.out.println("Serialization complete!");
//            
//        } catch (FileNotFoundException ex) {} 
//        catch (IOException ex) {}
//    }
//    
//    static void read(){
//        try(FileInputStream fis = new FileInputStream("src/applied.bin")){
//            
//            System.out.println("\nReading objects: ");
//            
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            Applied o;
//            o = (Applied) ois.readObject();
//            System.out.println(o);
//            o = (Applied) ois.readObject();
//            System.out.println(o);
//            o = (Applied) ois.readObject();
//            System.out.println(o);
//            
//            ois.close();
//            
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(T49Serialization.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(T49Serialization.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(T49Serialization.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}
//
//enum Gender {
//    men(true, false, false),
//    woman(false, true, false),
//    other(false, false, true);
//
//    private final boolean beard, longHair, object;
//
//    Gender(boolean x, boolean y, boolean z) {
//        beard = x;
//        longHair = y;
//        object = z;
//    }
//}
//
//class Applied implements Serializable{
//    private String name;
//    private Gender gender;
//    private int age;
//    
//    Applied(String name, Gender gender, int age){
//        this.name = name; 
//        this.gender = gender; 
//        this.age = age;
//    }
//    
//    @Override
//    public String toString(){
//        return "Name: "+name+", Gender: "+gender+", Age: "+age;
//    }
//}