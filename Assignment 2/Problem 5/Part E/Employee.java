public class Employee {
    private String name;
    protected Integer hours;

    public Employee(String n, Integer h) {
        name = n;
        hours = h;
    }

    public Double calculateSalary() {
        return hours*20.0;
    }
}
