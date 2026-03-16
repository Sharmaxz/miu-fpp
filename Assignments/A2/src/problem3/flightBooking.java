package problem3;

public record flightBooking (String origin, String destination, double distanceKm){
    /*: origin, destination, distanceKm
• Method: compute and return distanceKm / avgSpeed
public double computeFlightTime(double avgSpeed) */
    // private final String origin;
    // private final String destination;
    // private final double distanceKm;

    // public flightBooking(String origin, String destination, double distanceKm) {
    //     this.origin = origin;
    //     this.destination = destination;
    //     this.distanceKm = distanceKm;
    // }

    /* getters */ //unnecessary in a record class
    // public String getDestination() {
    //     return destination;
    // }

    // public double getDistanceKm() {
    //     return distanceKm;
    // }

    // public String getOrigin() {
    //     return origin;
    // }

    @Override
    public String toString(){
        return "[" + this.origin + ", " + this.destination + ", " + origin + "]";
    }
    
    public double computeFlightTime(double avgSpeed){
        return distanceKm / avgSpeed;
    }
    
}
