package org.example;

public class Vehicle {
    User user;
    String vehicleName;
    String vehicleNumber;

    public Vehicle(User user, String vehicleName, String vehicleNumber) {
        this.user = user;
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
