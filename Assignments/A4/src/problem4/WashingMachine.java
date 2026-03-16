package problem4;

public class WashingMachine  implements Appliance {
    private int loadCapacity;

    public WashingMachine(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    //overrides abstract interface function
    @Override
    public void performFunction() {
        System.out.println("Starting wash cycle with load capacity: " + loadCapacity + " kg.");
    }
}
