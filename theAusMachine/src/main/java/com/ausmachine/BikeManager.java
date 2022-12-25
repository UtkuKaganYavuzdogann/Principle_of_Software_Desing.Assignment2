package com.ausmachine;

public class BikeManager implements Bicycle {
    private String id;
    private String bike_type = null;
    private String model;
    private String colour;
    private double price;
    private int bike_gear_amount;
    private String lockKey;
    private String parkingSpot;


    public BikeManager(String id, String bike_type, String model, String colour, double price, int gearAmount) {
        this.id = id;
        this.bike_type = bike_type;
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.bike_gear_amount = gearAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBicycle_type() {
        return bike_type;
    }

    public void setBicycle_type(String bike_type) {
        this.bike_type = bike_type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getgearAmount() {
        return bike_gear_amount;
    }

    public void setgearAmount(int gearAmount) {
        this.bike_gear_amount = gearAmount;
    }

    public String getLockKey() {
        return lockKey;
    }

    public void setLockKey(String lockKey) {
        this.lockKey = lockKey;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(String parkingSpot) {
        this.parkingSpot = parkingSpot;
    }




    @Override
    public void getInFo() {
        System.out.println("****** Bikes Specs ******");
        System.out.println(

                "Model       : " + this.model +
                        "\nColor       : " + this.colour +
                        "\nGear Amount : " + this.bike_gear_amount +
                        "\nPrice       : $" + this.price

        );
    }
}