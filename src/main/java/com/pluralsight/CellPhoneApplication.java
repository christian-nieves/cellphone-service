package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        System.out.print("What is the serial number?: ");
        int serialNum = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What model is the phone?: ");
        String phoneModel = scanner.nextLine();

        System.out.print("Who is the carrier?: ");
        String carrier = scanner.nextLine();

        System.out.print("What is the phone number?: ");
        String phoneNum = scanner.nextLine();

        System.out.println("Who is the owner of the phone?: ");
        String owner = scanner.nextLine();







    }
}
