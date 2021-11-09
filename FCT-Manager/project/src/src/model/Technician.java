package src.model;

public class Technician extends Employee {
    private String function;

    public Technician() {
        super();
        function = Constants.getTechLevel(1);
    }

    public Technician(String id, String name, double salary, String level, String function) {
        super(id, name, salary, level);
        this.function = function;
    }

    @Override
    public double calculateSalary() {
        return getSalary() * Constants.techAdditional(level);
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}