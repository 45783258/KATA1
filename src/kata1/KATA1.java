package kata1;

import java.util.Date;

public class KATA1 {

    public static void main(String[] args) {
        Person person = new Person("Daniel", new Date(49,8,24));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
