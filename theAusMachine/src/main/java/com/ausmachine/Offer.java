package com.ausmachine;

public class Offer extends AutomataSystem {

    public Offer() {
    }

    public void actions(int option, Customer customer, BikeManager bikeManager) {

        if (option == 1 || option == 2 || option == 3) {
            switch (option) {
                case 1 -> {
                    System.out.println("You chose Buying a new Bike........ ");
                    super.buying(customer, bikeManager);
                    driveTest(bikeManager, "y");
                    super.makePayment("credit", customer, bikeManager, "6544 6544 8787 7542", "12/23");
                    super.contract("credit", customer, bikeManager);
                    parkingSpotAndLockKey();
                }

                case 2 -> {
                    System.out.println("You chose Renting a Bike ");
                    super.rentaBike();
                }
                case 3 -> {
                    System.out.println("You chose Turning your bike for repair ");
                    super.repair();
                }
            }
        } else {
            System.out.println(" Please choose invalid Transaction (one of the following options )" +
                    "\n** 1: Buy a Bicycle ******************** 2: Rent a Bicycle ******************** 3: Turn Your Bicycle For a Repair** ");

        }

    }

    public void driveTest(BikeManager bikeManager, String respond) {
        if (respond.toLowerCase().contains("y")) {
            System.out.println("You chose 'y'");
            System.out.println("You are testing...... " + bikeManager.getModel());

        } else
            System.out.println("You decline to take this bike on a test ride");

    }

    public void parkingSpotAndLockKey() {
        System.out.println("Please make sure to take the paper that contains parking spot info" +
                " and keys from the box below... ");

        System.out.println("Thank you for choosing AuS ... hope we will meet again...");
        System.out.println("Programmed by Poyraz Özbeğ | 2022");

    }
}
