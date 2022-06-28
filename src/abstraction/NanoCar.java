package abstraction;

public class NanoCar extends DemoPiece {
    @Override
    public void engine() {
        System.out.println("engine is nano");
    }

    @Override
    public void tyres() {
        System.out.println("tyres is nano");
    }

    @Override
    public void steering() {
        System.out.println("steering is nano");
    }
}
