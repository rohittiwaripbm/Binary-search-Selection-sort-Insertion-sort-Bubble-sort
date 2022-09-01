public class Abstract_keyword {
    public static void main(String[] args) {
        Horse Badal = new Horse("Badal");

        Badal.sleep(6);
        Badal.walk(90000);

        // Badal.sleep(35);

    }
}

abstract class Animal {
    int steps, hours;
    String name;

  

    abstract public void walk(int steps);

    abstract public void sleep(int hours);
}

class Horse extends Animal {
    int steps, hours;

    String name;
    Horse(String name)
    {
        this.name = super.name;
        System.out.println("Name of the horse is " + name);
    }
    @Override
    public void walk(int steps) {
        this.steps = super.steps;
        System.out.println("Walks " + steps + " steps per day");

    }

    @Override
    public void sleep(int hours) {
        this.hours = super.hours;
        System.out.println("Sleeps " + hours + " hours per day");
    }
}