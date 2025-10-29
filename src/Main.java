import models.Cars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner enter = new Scanner(System.in);
//        System.out.print("Enter tipul de auto: ");
//        String car3 = enter.nextLine();
//        System.out.println("Tipul de auto  "+ car3);
        Cars car1 = new Cars();
        car1.setTipAuto("Truck");
        car1.setMarca("Opel");
        car1.setSeats((byte) 10);
        System.out.println(car1.getTipAuto() + "  " + car1.getMarca());
        Cars car2 = new Cars("Bus", "BMW", "Yelow");
        System.out.println(car2.getTipAuto() + "  " + car2.getMarca() + " " + car2.getColor());
    }
}