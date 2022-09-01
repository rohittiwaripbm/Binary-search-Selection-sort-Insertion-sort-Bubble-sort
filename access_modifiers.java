//Access modifiers are -->  Public, Private and Protected;
public class access_modifiers {
    public static void main(String[] args) {
        System.out.println("Hello Rohit");
        fun();
        Person p = new Person();
        p.printinga(122);
        // We cannot use a because it is private;
        //p.a = 12;
        p.d = 124;
        Person2 p3 = new Person2();
        p3.d=23;
        p3.printinga(44);

    }

   
    //we can use this private anywhere in this file 
    private static void fun()
    {
      int a =12;
      System.out.println("Printing in function");
      System.out.println("Value of a  is : " +a);
    }
}

/**
 * Person
 */
class Person {
    protected int a;
    protected int d =12;
    protected void printinga(int a)
    {
        this.a = a;
        System.out.println("Printing in class person");
        System.out.println("Value of a is " + a);
        System.out.println("Value of d is " + d);
        
    }
    
}

class Person2 extends Person{
    // int c = 12;
    
    protected void printinga(int a)
    {
        super.a = a;
        System.out.println("Printing in person2");
        System.out.println("Value of a is " + a);
        System.out.println("Value of d in person2 is : " + d);
    }
    int c = super.d;

    
}