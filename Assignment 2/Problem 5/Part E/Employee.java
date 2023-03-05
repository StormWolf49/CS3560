public class Employee {
    private String name;
    protected Integer hours;

    public Employee(String name, Integer hours) {
        this.name = name;
        this.hours = hours;
    }

    public Double calculateSalary() {
        return hours*20.0;
    }
}
