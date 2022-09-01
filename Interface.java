public class Interface {
    public static void main(String[] args) {
        // System.out.println("Interface class");
        ABCIMP ab = new ABCIMP();
        ab.Ad();
        ab.Cd();
    }
}
/**
 * ABC
 */
interface ABC {

    void Cd();
}
/**
 * InnerInterface
 */
interface InnerInterface {
    void Ad();

    
}

class ABCIMP implements ABC, InnerInterface{
    public void Cd(){
        System.out.println("This method should be in this class for interface");
    }
    public void Ad()
    {
        System.out.println("InnerInterface");
    }
}