package task5;

public class Test {
    public static void main(String[] args) {
        FullTimeEmployee e1 = new FullTimeEmployee("Hassan", 20);

        PartTimeEmployee e2 = new PartTimeEmployee("Faisal", 18);

        System.out.println( e1.name + " full time employee monthly salary: " + e1.calculateSalary());
        System.out.println( e2.name + " full time employee hourly salary: " + e2.calculateSalary());

        e1.payTax();
        e2.payTax();
    }
}
