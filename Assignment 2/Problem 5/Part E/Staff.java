public class Staff extends Employee {
    private Integer role;
    
    public Staff(String n, Integer h, Integer r) {
        super(n, h);
        role = r;
    }
}
