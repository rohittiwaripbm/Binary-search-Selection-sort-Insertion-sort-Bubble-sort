public class getters_setters2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setDepartment("IT");
        e.setSalary(60000);
        e.name = "Rohini";
        System.out.println("Name is : "+e.name);
        System.out.println("Salary is : "+e.getSalary());
        System.out.println("Department is : "+e.getDepartment());
    }
}

class Employee {
    private int salary;
    protected String name;
    private String department;
    private boolean admin = false;

    public void setSalary(int salary) {
        if (admin) {
            System.out.println("Not Authorized");
        } else {
            this.salary = salary;
        }

    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        if (admin) {
            System.out.println("Can't Change");
        } else {
            this.department = department;
        }

    }

    public String getDepartment() {
        return department;
    }
}