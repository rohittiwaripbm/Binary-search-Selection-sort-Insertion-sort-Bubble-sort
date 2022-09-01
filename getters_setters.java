public class getters_setters {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.set(50000, "Rupesh");
        System.out.println("Name is : " + p1.getName());
        System.out.println("salary  is : " + p1.getsalary());

    }
}

class Person {
    private double salary;
    private String name;
    boolean admin = true;

    public void set(double salary, String name) {
        if (!admin) {
            System.out.println("Your are not authorized to change the values");
        } else {
            this.name = name;
            this.salary = salary;
        }
    }

    public String getName() {
        return name;
    }

    public double getsalary() {
        return salary;
    }

}