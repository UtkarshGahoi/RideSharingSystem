package org.example;

import java.util.List;

public interface SelectRide {
    public List<offerRide> getRides(User user, String origin , String destination);
}
