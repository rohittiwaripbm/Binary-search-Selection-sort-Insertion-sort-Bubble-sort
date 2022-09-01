public class  J_inheritance {
    public static void main(String[] args) {
        Parent p = new Parent(12, 23);
        Child c = new Child(34,23);

    }
}
class Parent{
    // public Parent()
    // {
    //     System.out.println("This is parent class constructor");
    // }

    public Parent(int a, int b)
    {
        System.out.println("This is parent class with some Parameters");
    }
}

class Child extends Parent
{

   
     public Child(int a, int b)
    {
        super(a, b);
        System.out.println("This is child class Constructor");
        System.out.println("Value is "+ a + " " + b);
     }
}