package src.model;

public abstract class Professor extends Employee {
    protected String degree;

    public Professor() {
        super();
        degree = "";
    }

    public Professor(String id, String name, double salary, String level, String degree) {
        super(id, name, salary, level);
        this.degree = degree;
    }

    public abstract double calculateSalary();

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
