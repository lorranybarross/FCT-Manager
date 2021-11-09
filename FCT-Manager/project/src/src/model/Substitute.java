package src.model;

public class Substitute extends Professor {
    private int workLoad;

    public Substitute() {
        super();
        workLoad = 0;
        level = Constants.getSubstituteLevel(1);
    }

    public Substitute(String id, String name, double salary, String level, String degree, int workLoad) {
        super(id, name, salary, level, degree);
        this.workLoad = Constants.validateSubstituteWorkload(workLoad);
    }

    @Override
    public double calculateSalary() {
        return getSalary() * Constants.subsAdditional(level);
    }

    public void setWorkLoad(int workLoad) {
        this.workLoad = Constants.validateSubstituteWorkload(workLoad);
    }

    public int getWorkLoad() {
        return workLoad;
    }
}
