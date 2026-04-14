package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        System.out.print("What is the serial number?: ");
        int serialNum = scanner.nextInt();
        phone.setSerialNumber(serialNum);
        scanner.nextLine();

        System.out.print("What model is the phone?: ");
        String phoneModel = scanner.nextLine();
        phone.setModel(phoneModel);

        System.out.print("Who is the carrier?: ");
        String carrier = scanner.nextLine();
        phone.setCarrier(carrier);

        System.out.print("What is the phone number?: ");
        String phoneNum = scanner.nextLine();
        phone.setPhoneNumber(phoneNum);

        System.out.print("Who is the owner of the phone?: ");
        String owner = scanner.nextLine();
        phone.setOwner(owner);


        System.out.println("\nHere is your phone information: ");

        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());

        scanner.close();








    }
}
