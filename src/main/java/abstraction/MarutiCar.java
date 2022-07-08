package abstraction;

public class MarutiCar implements ICar, IEngine {
    @Override
    public void tyres() {
        System.out.println("tyres are from maruti");
    }

    @Override
    public void engine() {
        System.out.println("Engine is from maruti");
    }

    @Override
    public void body() {
        System.out.println("Body is from maruti");
    }

    @Override
    public void ac() {
        System.out.println("AC is from maruti");
    }

    @Override
    public void accelerator() {
        System.out.println("Accelerator is from maruti");
    }

    @Override
    public void steering() {
        System.out.println("Steering is from maruti");
    }

    @Override
    public void thrust() {

    }

    @Override
    public void belt() {

    }

    @Override
    public void oil() {

    }
}
