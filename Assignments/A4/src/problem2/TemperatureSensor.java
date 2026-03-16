package problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor implements Sensor{
    private final String name = "Temperature Sensor";
    public String location;
    public double temperature; 
    public LocalDateTime lastTime; 

    public TemperatureSensor(String location, double temperature) {
        if(location == null || location.isEmpty() || location.isBlank()) {
            System.err.println("Location must have a name. E.g. Kitchen.");
            //throw an error.
        }

        this.temperature = temperature;
        this.location = location;
        this.lastTime = LocalDateTime.now();
    }

    @Override
    public String getSensorType() {
        return name;
    }

    @Override
    public double getReading() {
        return temperature;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public LocalDateTime getLastUpdated() {
        //time as current time
        this.lastTime = LocalDateTime.now();
        return this.lastTime;
    }

    @Override
    public String toString(){
        /*
        Sensor Type: Temperature
        Reading: 23.5
        Location: Living Room
        Last Updated: 03:55 PM
        Action: Temperature is within the normal range
        */

        //we must format the unformatted time.
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
       String date = this.lastTime.format(formatter);
       String output = String.format("Sensor Type: %s\nReading: %.2f\nLocation: %s\nLastUpdated: %s\nAction: %s", getSensorType(), getReading(), getLocation(), date, performAction());
       return output;
    }
    
    // perform action based on the current temperature
    @Override
    public String performAction() {
        if(this.temperature > 30){
            return "an alert to turn on the AC";
        } else if(this.temperature < 18){
            return "an alert to turn on the Heater";
        } else {
            return "Temperature is in normal range";
        }
    }

}
