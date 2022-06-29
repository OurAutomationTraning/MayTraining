package abstraction;

public class Test {
    public static void main(String[] args) {
        NanoCar demo=new NanoCar();
        demo.ac();
        demo.accelerator();
        MarutiCar marutiCar = new MarutiCar();
        ICar iCar = new MarutiCar();
        iCar = new TataCar();
//        DemoPiece democlz = new NanoCar();

    }
}
