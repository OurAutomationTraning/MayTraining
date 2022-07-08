package abstraction;

public abstract class DemoPiece implements ICar {
    @Override
    public void ac() {
        System.out.println("abstract class AC");
    }

    @Override
    public void accelerator() {
        System.out.println("abstract class accelerator");
    }

    public abstract void engine() ;

    @Override
    public void body() {
        System.out.println("abstract class body");
    }

    public abstract void tyres();

    public abstract void steering();
}
