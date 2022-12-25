package com.ausmachine;

public class Home {

    //creating customers
    Offer offer = new Offer();
    AutomataSystem automataSystem = new AutomataSystem();
    Customer customer1 = new Customer("Bora", "DEVELER", "5323206489", "789465239164");
    //creating bikes


    public void welcome() {
        automataSystem.listOfBike();

        BikeManager bike = automataSystem.getBicycle().get(2);

        System.out.println(
                "#######################################################################################" +
                        "\n#                                      The Automata System                                #" +
                        "\n#######################################################################################");



        System.out.println("Welcome " + customer1.getFirstName() + " " + customer1.getLastName() +
                " to The Automata System Where you can buy a bicycle as easy as order a meal" +
                "\nfrom a food automata   ");
        System.out.println("\nHere is what you can do with The Automata System. Please select the operation you want to do ");

        System.out.println(
                "\n1: Buy a Bicycle" +
                        "\n2: Rent a Bicycle" +
                        "\n3: Turn Your Bicycle For a Repair");
        //The transaction that the customer wants to make is passed to this method
        //since we are putting all inputs as a static we just chose to pass 1 for buying transactions
        System.out.println("****************These are available bicycles for sale************");
        for (int i = 0; i < automataSystem.getBicycle().size() ; i++) {
            BikeManager bike1 = automataSystem.getBicycle().get(i);
            bike1.getInFo();
        }
        offer.actions(1, customer1, bike);



    }


}