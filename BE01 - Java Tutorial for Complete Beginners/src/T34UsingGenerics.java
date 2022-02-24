
import java.util.ArrayList;

public class T34UsingGenerics {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Cat");
        list1.add("Dog");
        System.out.println(list1.get(1));
        
        ArrayList<T34UsingGenerics> list2 = new ArrayList<T34UsingGenerics>();
        list2.add(new T34UsingGenerics());
        list2.add(new T34UsingGenerics());
        System.out.println(list2.get(1).getClass());
    }
}
