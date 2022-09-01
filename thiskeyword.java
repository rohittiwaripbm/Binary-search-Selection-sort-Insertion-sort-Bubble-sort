public class thiskeyword {
    public static void main(String[] args) {
        //System.out.println("This is main class");
        //creating classes objects;
        //Constructor1 c = new Constructor1();
        Constructor1 c1 = new Constructor1(12);
        
        int d = c1.b;
        System.out.println("Value of b inside main");
        System.out.println(d);

        

    }
}
class Constructor1{
    static int a;
    static int b = 12;

    //constructor with no arguments;
    public Constructor1()
    {
        System.out.println("This is constructor1");
    }
    //Constructor with arguments;
    public Constructor1(int a)
    {
        this();
        this.a=a;
        System.out.println("This is constructor 2 with arguments");
        System.out.println("Value of a is " + a);
    }
}