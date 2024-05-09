package org.example;

import java.util.ArrayList;
import java.util.List;

public class SelectRideImpl implements SelectRide{

    private List<offerRide>offerRideList;

    public SelectRideImpl(List<offerRide> offerRideList) {
        this.offerRideList = offerRideList;
    }

    @Override
    public List<offerRide> getRides(User user, String origin, String destination) {
        List<offerRide>OfferedRide=new ArrayList<>();
       for(offerRide offerRide:offerRideList){
           if(offerRide.origin.equalsIgnoreCase(origin) && offerRide.destination.equalsIgnoreCase(destination)){
               OfferedRide.add(offerRide);
           }
       }
       return OfferedRide;
    }
}
