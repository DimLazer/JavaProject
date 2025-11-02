import models.Transport;

public class Main {
    public static void main(String[] args) {
        Transport car = new Transport();
        Transport car1 = new Transport("TRUCK","OPEL",(byte)5,(short)200,"GJJ-567","Black" );
        car.setTipAuto("Bus");
        car.setModel("IVECO");
        car.setLicensePlate("HHJJK-775");
        car.setColor("Black");
        car.setSeats((byte) 50);
        car.setMaxSpeed((short) 120);

        System.out.println("You can move with your vehicle at max speed :" + car.getMaxSpeed() + "km/h");
        System.out.println("1 "+"You have " + car.getTipAuto() + " de model " + car.getModel() + " care are " + car.getSeats() + " locuri .");
//        System.out.println("2 "+"You have " + car1.getTipAuto() + " de model " + car1.getModel() + " care are " + car1.getSeats() + " locuri .");
    }
}