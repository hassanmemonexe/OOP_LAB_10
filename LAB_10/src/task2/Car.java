package task2;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("the car has started");
    }
    public void stop() {
        System.out.println("the car has stopped");
    }
}
