package problem2;

import java.time.LocalDateTime;

public interface Sensor{
    String getSensorType();// – Return the name of the Sensor
    double getReading();// – Return the sensor data in double
    String getLocation();// – Return the Home location where sensor deployed. [ Garden, Kitchen, etc.,]
    LocalDateTime getLastUpdated();// – Return the system current time.
    String performAction();// - Return the action taken based on the Sensor alert
}