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

        CellPhone phone2 = new CellPhone();

        System.out.print("What is the serial number?: ");
        int serialNum2 = scanner.nextInt();
        phone2.setSerialNumber(serialNum2);
        scanner.nextLine();

        System.out.print("What model is the phone?: ");
        String phoneModel2 = scanner.nextLine();
        phone2.setModel(phoneModel2);

        System.out.print("Who is the carrier?: ");
        String carrier2 = scanner.nextLine();
        phone2.setCarrier(carrier2);

        System.out.print("What is the phone number?: ");
        String phoneNum2 = scanner.nextLine();
        phone2.setPhoneNumber(phoneNum2);

        System.out.print("Who is the owner of the phone?: ");
        String owner2 = scanner.nextLine();
        phone2.setOwner(owner2);


        System.out.println("\nHere is your phone information: ");

        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());


        /*phone2.setOwner("Johnathon Doeman");
        phone2.setModel("iPhone 17 Pro Max");
        phone2.setCarrier("T-Mobile");
        phone2.setPhoneNumber("321-654-2828");
        phone2.setSerialNumber(416712388);*/

       phone.dial(phone2.getPhoneNumber());
       phone2.dial(phone.getPhoneNumber());


        scanner.close();








    }

}
