
import models.Transport;



public class Main {
    public static void main(String[] args) {
        Transport car = new Transport();
        Transport truck = new Transport("TRUCK", "OPEL", (byte) 5, (short) 200, "GJJ-567", "Black");
        Transport bus = new Transport("BUS", "FORD", (byte) 50, (short) 120, "GHJ-456", "yellow");
        Transport moto = new Transport("MOTO","Yamaha",(byte) 2,(short) 320,"HHJ-789","White");
        Transport auto = new Transport("AUTO","MERSERES",(byte)5 ,(short) 250,"BNM-456","RED");
        car.setTipAuto("Bus");
        car.setModel("IVECO");
        car.setLicensePlate("HHJJK-775");
        car.setColor("Black");
        car.setSeats((byte) 50);
        car.setMaxSpeed((short) 120);
        System.out.println(" You can move with your vehicle at max speed :" + car.getMaxSpeed() + " km/h");
        System.out.println("1 " + "You have " + car.getTipAuto() + " de model " + car.getModel() + " care are " + car.getSeats() + " locuri .");
        System.out.println("2 " + "You have " + truck.getTipAuto() + " de model " + truck.getModel() + " care are " + truck.getSeats() + " locuri .");
        System.out.println("3" + " You choose the " + bus.getTipAuto() + ":\n - with capacity " + bus.getSeats() + " seats:" + "\n - and max. speed limit: "+"\u001B[31m" + bus.getMaxSpeed()+"\u001B[0m km/h: \n - licence plate: \u001B[32m"+ bus.getLicensePlate()+"\u001B[0m");

    }

}