package problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor{
    private final String name = "Sound Sensor";
    public String location;
    public double soundLevel; 
    public LocalDateTime lastTime; 


    public SoundSensor(String location, double soundLevel) {
        if(location == null || location.isEmpty() || location.isBlank()) {
            System.err.println("Location must have a name. E.g. Kitchen.");
            //throw an error.
        }

        //sound level cannot be negative
        if(soundLevel < 0) {
            soundLevel = 0;
        }

        this.location = location;
        this.soundLevel = soundLevel;
        this.lastTime = LocalDateTime.now();
    }


    @Override
    public String getSensorType() {
        return name;
    }

    @Override
    public double getReading() {
        return soundLevel;
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

    // based on the sound level
    @Override
    public String performAction() {
        if(this.soundLevel > 70){
             return "an alert to turn on noise cancellation";
        } else {
            return "Sound is within normal range";
        }
    }

}