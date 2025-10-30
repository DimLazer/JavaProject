import models.Cars;
public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        car1.setTipAuto("Truck");
        car1.setMarca("Opel");
        car1.setSeats((byte) 10);
        System.out.println(car1.getTipAuto() + "  " + car1.getMarca());
        Cars car2 = new Cars("Bus", "BMW", "Yelow");
        System.out.println(car2.getTipAuto() + "  " + car2.getMarca() + " " + car2.getColor());
    }
}
