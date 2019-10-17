/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3sample.Business;

/**
 *
 * @author tusiyu
 */
public class Flight {
    private String airliners;
    private int seats;
    private String deparute;
    private String arrive;
    private String from;
    private String to;

    public Flight(String airliners, int seats, String deparute, String arrive, String from, String to) {
        this.airliners = airliners;
        this.seats = seats;
        this.deparute = deparute;
        this.arrive = arrive;
        this.from = from;
        this.to = to;
    }

    public String getAirliners() {
        return airliners;
    }

    public void setAirliners(String airliners) {
        this.airliners = airliners;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getDeparute() {
        return deparute;
    }

    public void setDeparute(String deparute) {
        this.deparute = deparute;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
    
    public void updateFlight(String airliners, int seats, String deparute, String arrive, String from, String to) {
        this.airliners = airliners;
        this.seats = seats;
        this.deparute = deparute;
        this.arrive = arrive;
        this.from = from;
        this.to = to;
    }
    
    public void bookFlight() {
        this.seats--;
    }
    
    @Override
    public String toString(){
       return airliners;
    }
    
}
