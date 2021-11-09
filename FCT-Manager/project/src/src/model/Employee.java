package src.model;

public abstract class Employee {
    protected String id;
    protected String name;
    protected double salary;
    protected String level;

    public abstract double calculateSalary();

    public Employee() {
        this.id = "";
        this.name = "";
        this.salary = 0.0f;
        this.level = "";
    }

    public Employee(String id, String name, double salary, String level) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.level = level;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
