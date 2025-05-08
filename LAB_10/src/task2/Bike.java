package task2;

public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("the bike has started");
    }
    public void stop() {
        System.out.println("the bike has stopped");
    }
}
