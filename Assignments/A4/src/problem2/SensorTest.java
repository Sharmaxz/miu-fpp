package problem2;

public class SensorTest {

    // a. Create an array of type Sensor, Store 5 different objects.
    // b. Loop through the objects and print the status of the objects. (Override toString())
    // c. Print the getLastUpdated() output shows the time in HH:MM am/pm
    public static void main(String[] args) {

        Sensor soundSensor = new SoundSensor("Airport", 100);
        Sensor soundSensor1 = new SoundSensor("House", 10);
        Sensor lightSensor = new LightSensor("House", 50);
        Sensor lightSensor1 = new LightSensor("The Sun", 1000000);
        Sensor temperatureSensor = new TemperatureSensor("The Sun", 1000000);
        Sensor temperatureSensor1 = new TemperatureSensor("Airport", 10);
        Sensor temperatureSensor2 = new TemperatureSensor("House", 20);

        //sensors list
        Sensor[] sensors = {soundSensor, soundSensor1, lightSensor, lightSensor1, temperatureSensor, temperatureSensor1, temperatureSensor2};
        
        // Loop through the objects and print the status of the objects. (Override toString())
        for(Sensor sensor : sensors){
            System.out.println(sensor.toString() + "\n");
        }

    }



}