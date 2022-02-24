
import java.util.ArrayList;

class Vehicle{
    @Override
    public String toString(){
        return "I am a vehicle";
    }
}

class Car extends Vehicle{
    @Override
    public String toString(){
        return "I am a car";
    }
    void fuel(){
        System.out.println("fuling...");
    }
}

class Auto extends Vehicle{
    void charge(){
        System.out.println("Charging...");
    }
}

public class T35GenericsAndWildcards {
    public static void main(String[] args) {
        ArrayList<Vehicle> list = new ArrayList<Vehicle>();
        list.add(new Vehicle());
        list.add(new Vehicle());
        showList2(list);
        
        ArrayList<Vehicle> list2 = new ArrayList<Vehicle>();
        list2.add(new Car());
        list2.add(new Car());
        showList3(list2);
    }
    
    //can have only vehicle type parameter
    static void showList(ArrayList<Vehicle> list){
        for(Vehicle value: list){
            System.out.println(value);
        }
    }
    
    //can have any type of parameter. <?> is same as <Object>
    static void showList2(ArrayList<?> list){
        for(Object value: list){
            System.out.println(value);
        }
    }
    
    //This method receives any sub class of Vehicle
    static void showList3(ArrayList<? extends Vehicle> list){
        for(Vehicle value: list){
            System.out.println(value);
        }
    }
    
    //This method receives any sub class of Vehicle or Vehicle itselft!
    static void showList4(ArrayList<? super Vehicle> list){
        for(Object value: list){
            System.out.println(value);
        }
    }
    
    
}
