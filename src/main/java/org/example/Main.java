package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user=new User("Utkarsh","demo1@gmail.com","25");
        User user1=new User("Utkarsh","demo2@gmail.com","24");
        User user2=new User("Rajershi","demo3@gmail.com","20");
        User user3=new User("demo","demo4@gmail.com","21");
        Vehicle vehicle=new Vehicle(user,"NEXON","up90Z1111");

        List<offerRide>offerRideList=new ArrayList<>();
        offerRide offerRide=new offerRide(user,"delhi","kanpur",1,vehicle);
        offerRide offerRide1=new offerRide(user1,"gurgaon","MUMBAI",2,vehicle);

        offerRideList.add(offerRide);
        offerRideList.add(offerRide1);

        SelectRideImpl selectRide=new SelectRideImpl(offerRideList);
        var rides = selectRide.getRides(user2, "delhi", "kanpur");
        for(offerRide offerRide2:rides){
            System.out.println(offerRide2.availableSeats+" "+offerRide2.origin+" "+offerRide2.destination);
        }



    }
}