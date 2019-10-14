
package assignment3sample.Business;


public class Customer {

    private String name;
    private String airliners;
    private int seats;
    private String deparute;
    private String arrive;
    private String from;
    private String to;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
   @Override
    public String toString() {
        return this.getName();
    }
}
