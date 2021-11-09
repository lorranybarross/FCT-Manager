package src.model;

public class Permanent extends Professor {
    private String area;

    public Permanent() {
        super();
        this.area = "";
        this.level = Constants.getPermanentLevel(1);
    }

    public Permanent(String id, String name, double salary, String level, String degree, String area) {
        super(id, name, salary, level, degree);
        this.area = area;
    }

    @Override
    public double calculateSalary() {
        double wage = getSalary() * Constants.permAdditional(level);
        wage += getSalary() * Constants.permExtra();
        return wage;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }
}
