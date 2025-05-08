package task4;

public class Duck implements Flyable, Swimmable{
    @Override
    public void fly() {
        System.out.println("the duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("the duck is swimming");
    }
}
