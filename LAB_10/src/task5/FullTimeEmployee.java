package task5;

public class FullTimeEmployee extends Employee implements TaxPayer{
    @Override
    public double calculateSalary() {
       return 100000;
    }

    @Override
    public void payTax() {
        System.out.println("5% tax payed");
    }

    public FullTimeEmployee(String name, int age){
        super(name, age);
    }
}
