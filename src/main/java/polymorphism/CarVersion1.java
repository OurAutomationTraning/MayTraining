package polymorphism;

import java.util.Locale;

public class CarVersion1 {
    public String tyres(String side) {
        if (side.toLowerCase(Locale.ROOT).equals("front")) {
            return "CEAT";
        } else {
            return "MRF";
        }
    }

    public void engine() {
        System.out.println("Engine is from maruti");
    }


    public void body() {
        System.out.println("Body is from maruti");
    }


    public void ac() {
        System.out.println("AC is from maruti");
    }


    public void accelerator() {
        System.out.println("Accelerator is from maruti");
    }


    public void steering() {
        System.out.println("Steering is from maruti");
    }
}
