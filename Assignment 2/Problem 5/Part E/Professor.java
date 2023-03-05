public class Professor extends Employee {
    private String field;

    public Professor(String name, Integer hours, String field) {
        super(name, hours);
        this.field = field;
    }

    public Double calculateSalary() {
        return hours*30.0;
    }
}
