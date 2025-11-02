import models.Transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        Transport car = new Transport();
        for (int i = 1; i <= 2; i++) {

            System.out.print("Enter " + i + " type of transport: ");
            car.setTipAuto(enter.nextLine());

            System.out.print("Enter " + i + " model of vehicle: ");
            car.setModel(enter.nextLine());

            System.out.print("Enter " + i + " number of seats: ");
            car.setSeats(enter.nextByte());

            System.out.print("Enter max speed for the " + i + " transport: ");
            car.setMaxSpeed(enter.nextShort());
            enter.nextLine();

            System.out.print("Enter licence number of " + i + " transport: ");
            car.setLicensePlate(enter.nextLine());
          // enter.nextLine();

            String all = "Type of transport: " + car.getTipAuto() + " Model: " + car.getModel() + " Num seats: " + car.getSeats() + "   Speed: " + car.getMaxSpeed()+ " km/h  licence plate: " + car.getLicensePlate();
            list.add(all);
            System.out.println(" ✅ Transport was added \n ");
        }

        System.out.println("You can move with your vehicle at max speed :" + car.getMaxSpeed() + "km/h");
        System.out.println("1 "+"You have " + car.getTipAuto() + " de model " + car.getModel() + " care are " + car.getSeats() + " locuri .");

    }
}
