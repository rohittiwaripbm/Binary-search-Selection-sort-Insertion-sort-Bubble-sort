//Overloading in  class;
public class Overloading
{
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person(45);
    }
}

class Person
{
    private int number;
    public Person()
    {
        number = 12;
        System.out.println("value of number is " + number);
    }

    public Person(int number)
    {
        this.number = number;
        System.out.println("The value of number is : " + number);
    }
}