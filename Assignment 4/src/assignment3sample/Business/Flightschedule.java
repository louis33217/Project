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
    private ArrayList<Flight> carList;
    private LocalDateTime latestDateTime;
    private DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    
    public String getLatestDateTime() {
        return latestDateTime.format(myFormat);
    }

   
    
    public void updateDateTime() {
        latestDateTime = LocalDateTime.now();
    }
    
    public Flightschedule(){
        
        carList = new ArrayList<>();
        
        Flight car1 = new Flight( "Ferrari", 150, "1", "2", "Taipei", "Boston");
        Flight car2 = new Flight( "BMW", 150, "1", "4", "Taipei", "New York");
        Flight car3 = new Flight( "Toyota", 150, "1", "4", "Taipei", "Boston");
        Flight car4 = new Flight( "GM", 150, "1", "4", "Taipei", "New York");
        Flight car5 = new Flight( "Toyota", 150, "1", "4", "Taipei", "Chicago");
        Flight car6 = new Flight( "GM", 150, "1", "4", "Taipei", "Chicago");
        Flight car7 = new Flight( "Ferrari", 150, "1", "4", "Taipei", "Seattle");
        Flight car8 = new Flight( "BMW", 150, "1", "4", "Taipei", "Seattle");
        Flight car9 = new Flight( "Toyota", 150, "1", "4", "Taipei", "Austin");
        Flight car10 = new Flight( "GM", 150, "1", "4", "Taipei", "Austin");
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        updateDateTime();
    }

    public ArrayList<Flight> getCarList() {
        return carList;
    }
    
    public void addProduct(Flight car){
        carList.add(car);
        updateDateTime();
    }
}
