
import java.util.Objects;

class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}

public class T45EqualsMethod {
    public static void main(String args[]){
        Person p1 = new Person("Jubu", 6);
        Person p2 = new Person("Jarin", 9);
        Person p3 = new Person("Jubu", 6);
        
        System.out.println(p1.equals(p3));
        
        Integer x = 5, y = 5;
        System.out.println(x==y);
        
        Double a = 5.5, b = 5.5;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        
        String m = "FXYZ", n = "FXYZ";
        System.out.println(m.equals(n));
    }
}
