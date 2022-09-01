public class Classes {
    public static void main(String[] args)
    {
        System.out.println("Creating classes");
        Person p1 = new Person();
        p1.name = "Roshit";
        p1.age = 23;
        // System.out.println("person p1 name is "+ p1.name);
        // System.out.println("person p1 age is "+ p1.age);
        System.out.println("------------------------------------------------");
        Person2 p3 = new Person2();
        p3.name = "Shonika";
        p3.eating();
        Person2 p4 = new Person2();
        p4.name = "Ronika";
        p4.sleeping();
        System.out.println("------------------------------------------------");
        p4.Sleeping(4);
        p3.Sleeping(6);
       
        System.out.println("------------------------------------------------");
        
    }
}
/**
 * Person
 */
class Person {
    String name;
    int age;
    
}

/**
 * Person2
 */
class Person2 {
    String name;
     
    void eating()
    {
        System.out.println(name + " is eating");
    }
    void sleeping()
    {
        System.out.println(name + " is Sleeping");
    }
    //Methods with arguments;
    void Sleeping(int hours)
    {
        int a = hours;
        System.out.println(name + " Sleeps for " + a + " Hours");
    }
}