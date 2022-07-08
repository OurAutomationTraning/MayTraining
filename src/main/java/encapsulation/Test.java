package encapsulation;

public class Test {
    public static void main(String[] args) {
        /*Car car = new Car();
        car.setEngine("1200 BHP");
        car.setLights("ON");
        car.setSpeed("100 MPH");
        car.setTyres("MRF");
        System.out.println(car.getEngine());
        System.out.println(car.getLights());
        System.out.println(car.getSpeed());
        System.out.println(car.getTyres());*/
        Student student = new Student();
        student.setFullName("Kongara Bharghav Sravan");
        System.out.println(student.getFirstName());
        System.out.println(student.getMiddleName());
        System.out.println(student.getLastName());
    }
}
