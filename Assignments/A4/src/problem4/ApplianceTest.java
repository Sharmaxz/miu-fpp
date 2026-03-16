package problem4;

public class ApplianceTest{
    public static void main(String[] args) {
        Appliance[] appliances = {
            new WashingMachine(7),
            new Refrigerator(4),
            new Microwave(800)
        };
        for (Appliance appliance : appliances) {
            appliance.performFunction();
        }
    }
}
