/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3sample.Business;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author tusiyu
 */
public class Flightschedule {
    private ArrayList<Flight> flightList;
    private LocalDateTime latestDateTime;
    private DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public String getLatestDateTime() {
        return latestDateTime.format(myFormat);
    }
    
    public void updateDateTime() {
        latestDateTime = LocalDateTime.now();
    }
    
    public Flightschedule(){
        
        flightList = new ArrayList<>();
        
        Flight flight1 = new Flight( "Ferrari", 150, "Morning", "Day", "Taipei", "Boston");
        Flight flight2 = new Flight( "BMW", 150, "Day", "Evening", "Taipei", "New York");
        Flight flight3 = new Flight( "Toyota", 150, "Evening", "Morning", "Taipei", "Boston");
        Flight flight4 = new Flight( "GM", 150, "Evening", "Day", "Taipei", "New York");
        Flight flight5 = new Flight( "Toyota", 150, "Night", "Night", "Taipei", "Chicago");
        Flight flight6 = new Flight( "GM", 150, "Morning", "Night", "Taipei", "Chicago");
        Flight flight7 = new Flight( "Ferrari", 150, "Day", "Evening", "Taipei", "Seattle");
        Flight flight8 = new Flight( "BMW", 150, "Morning", "Night", "Taipei", "Seattle");
        Flight flight9 = new Flight( "Toyota", 150, "Morning", "Evening", "Taipei", "Austin");
        Flight flight10 = new Flight( "GM", 150, "Night", "Night", "Taipei", "Austin");
        
        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);
        flightList.add(flight5);
        flightList.add(flight6);
        flightList.add(flight7);
        flightList.add(flight8);
        flightList.add(flight9);
        flightList.add(flight10);
        updateDateTime();
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }
    
    public void addProduct(Flight flight) {
        flightList.add(flight);
        updateDateTime();
    }
    
    public void deleteProduct(Flight flight) {
        flightList.remove(flight);
        updateDateTime();
    }
}
