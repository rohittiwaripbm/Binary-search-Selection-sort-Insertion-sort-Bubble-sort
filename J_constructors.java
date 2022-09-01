public class  J_constructors {
  
    public static void main(String[] args) {
        System.out.println("hello world" );
        Person4 p1 = new Person4();
        System.out.println(p1.count);
        System.out.println(Person4.count);
        

    }


}
    /**
     * InnerJ_constructors
     */
    class Person4 {
        String name;
        static int count = 0;
       public  Person4()
       {
           count++;
           System.out.println("this is constructor");
       }
         
     }