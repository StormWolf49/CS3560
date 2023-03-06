public class Payroll {
    private Worker worker;

    public Payroll() {
        worker = new Worker("", 0.0);
    }

    public static void processPayments(Worker worker) {
        System.out.println("Payment processed for wokrer " + worker.getName() + ".");
    }
}
