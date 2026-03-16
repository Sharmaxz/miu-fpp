package problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor {
    private final String name = "Light Sensor";
    public String location;
    public double lightLevel; //sensor data level
    public LocalDateTime lastTime; //updated every tie getLastUpdated is called

    public LightSensor(String location, double lightLevel) {
        if(location == null || location.isEmpty() || location.isBlank()) {
            System.err.println("Location must have a name. E.g. Kitchen.");
            //throw an error.
        }

        //light cannot be negative, so make it 0. 
        if(lightLevel < 0) {
            lightLevel = 0;
        }

        this.location = location;
        this.lightLevel = lightLevel;
        this.lastTime = LocalDateTime.now();
    }

    // simply return the type of sensor
    @Override
    public String getSensorType() {
        return name;
    }

    // return the current light level
    @Override
    public double getReading() {
        return lightLevel;
    }

    // returns location
    @Override
    public String getLocation() {
        return location;
    }

    // set current date as last date
    //return type localDatetime, to be formatted when we print it.
    @Override
    public LocalDateTime getLastUpdated() {
        //time as current time
        this.lastTime = LocalDateTime.now();
        return this.lastTime;
    }

    @Override
    public String performAction() {
        if(this.lightLevel < 100){
            return "Light level is too low! Turning on the lights. An alert to turn on the light";
        } else {
            return "Light is sufficient";
        }
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

    

}
