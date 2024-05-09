package org.example;

public class offerRide {
    User user;
    String origin;
    String destination;
    Integer availableSeats;
    Vehicle vehicle;

    public offerRide(User user, String origin, String destination, Integer availableSeats, Vehicle vehicle) {
        this.user = user;
        this.origin = origin;
        this.destination = destination;
        this.availableSeats = availableSeats;
        this.vehicle = vehicle;
    }
}
