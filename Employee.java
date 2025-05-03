public class Employee implements Payable {
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private Invoice[] invoices;

    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        return salaryPerMonth - calculateTotalInvoices();
    }

    private double calculateTotalInvoices() {
        double total = 0;
        for (Invoice invoice : invoices) {
            total += invoice.getPayableAmount();
        }
        return total;
    }

    public void printEmployeeInfo() {
        System.out.println("===== INFORMASI KARYAWAN =====");
        System.out.println("No. Registrasi : " + registrationNumber);
        System.out.println("Nama           : " + name);
        System.out.println("Gaji Bulanan   : " + salaryPerMonth);

        System.out.println("\n=== Daftar Belanjaan ===");
        for (Invoice invoice : invoices) {
            System.out.println(invoice.getDetail());
        }

        System.out.printf("\nGaji Setelah Potongan: %.2f%n", getPayableAmount());
    }
}