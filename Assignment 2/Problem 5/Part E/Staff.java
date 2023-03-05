public class Staff extends Employee {
    private Integer role;
    
    public Staff(String name, Integer hours, Integer role) {
        super(name, hours);
        this.role = role;
    }
}
