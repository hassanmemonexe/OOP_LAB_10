package task5;

public class Test {
    public static void main(String[] args) {
        FullTimeEmployee Hassan = new FullTimeEmployee();

        PartTimeEmployee Faisal = new PartTimeEmployee();

        System.out.println("full time employee salary: " + Hassan.calculateSalary());
        System.out.println("part time employee salary: " + Faisal.calculateSalary());

        Hassan.payTax();
        Faisal.payTax();
    }
}
