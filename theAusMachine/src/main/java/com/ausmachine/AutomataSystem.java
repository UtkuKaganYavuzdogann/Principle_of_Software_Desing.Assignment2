package com.ausmachine;


import java.util.ArrayList;
import java.util.List;

public class AutomataSystem {
    private List<BikeManager> bikes = new ArrayList<>();

    public AutomataSystem() {
    }


    public void buying(Customer customer, BikeManager bikeManager) {

        System.out.println("Mr./Mrs. " + customer.getFirstName() + " " + customer.getLastName() + " " +
                "you are about to buy this bike " +
                "\n ");
        bikeManager.getInFo();
        System.out.println("Would you like to take the bike on a ride ?");


    }

    public void makePayment(String method, Customer customer, BikeManager bikeManager, String credit_card_number, String exp_date) {
        if (method.toLowerCase().equals("credit")) {
            CreditCardPayment cc = new CreditCardPayment(
                    bikeManager.getPrice(),
                    customer.getFirstName(),
                    customer.getLastName(),
                    exp_date,
                    credit_card_number);
            cc.paymentDetails();
        } else if (method.toLowerCase().equals("cash")) {
            CashPayment c = new CashPayment(100);
            c.paymentDetails();
        } else {
            System.out.println("please write cash for 'cash' payment and 'credit' for credit payment ");
        }
    }

    public void contract(String payment_method, Customer customer, BikeManager bike) {
        Contract contract = new Contract(
                customer.getFirstName(),
                customer.getLastName(),
                customer.getPhone(),
                customer.getId(),
                bike.getBicycle_type(),
                bike.getModel(),
                bike.getColour(),
                bike.getgearAmount(),
                bike.getPrice(),
                payment_method);
        contract.getContract();
    }


    public void listOfBike() {
        BikeManager bike = new BikeManager("001", "BMX", "Gt Performer Bmx Bicycle", "Dark Blue", 1250, 12);
        BikeManager bike2 = new BikeManager("002", "BMX", "Wethepeople Crs Freecoaster", "Black", 2000, 18);
        BikeManager bike3 = new BikeManager("003", "Electric Bicycle", "RkIII Pro - Rk 3 Pro", "Dark Red", 1000, 8);
        bikes.add(0, bike);
        bikes.add(1, bike2);
        bikes.add(2, bike3);
    }


    public List<BikeManager> getBicycle() {
        return bikes;
    }

    public void setBikes(List<BikeManager> bikes) {this.bikes = bikes;}

    public void rentaBike() {
        System.out.println("WARNING!!! This feature will be available soon.");
    }

    public void repair() {
        System.out.println("WARNING!!! This feature will be available soon.");
    }
}
