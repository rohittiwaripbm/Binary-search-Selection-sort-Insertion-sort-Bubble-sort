public class Overriding {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show();
    }
}

class A{
    public void show()
    {
        System.out.println("in Class A ");
    }
    
    // public void show(int a )
    // {
    //     System.out.println("IN class a ");
    // }
}
class B extends A
{
    @Override
    public void show()
    {
        System.out.println("In class B");
    }
}