public class Main {
    public static void main(String[] args) {
        Invoice[] invoices = {
            new Invoice("Minyak Goreng", 2, 20000),
            new Invoice("Gula", 1, 15000),
            new Invoice("Beras", 1, 70000)
        };

        Employee employee = new Employee(122, "Haidar Ramzy", 7000000, invoices);

        showPayableSummary(employee);
    }

    public static void showPayableSummary(Payable payable) {
        if (payable instanceof Employee emp) {
            emp.printEmployeeInfo();
        }
    }
}