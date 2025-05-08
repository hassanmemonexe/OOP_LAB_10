package task5;

public class PartTimeEmployee extends Employee implements TaxPayer{

    @Override
    public double calculateSalary() {
        return 20;
    }

    public void payTax() {
        System.out.println("2% tax payed");
    }
    public PartTimeEmployee(String name, int age){
        super(name, age);
    }
}
