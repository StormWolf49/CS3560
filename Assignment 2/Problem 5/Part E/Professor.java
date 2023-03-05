public class Professor extends Employee {
    private String field;

    public Professor(String n, Integer h, String f) {
        super(n, h);
        field = f;
    }

    public Double calculateSalary() {
        return hours*30.0;
    }
}
