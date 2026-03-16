package problem3;

public final class CarRental {
    /*
    : carModel, days, ratePerDay, milesPerDay
• Methods:
 public double totalRentalCost() // return days * ratePerDay
 public double totalMilesAllowed() // return days * milesPerDa
 //  */

    //fields
    private String carModel;
    private int days;
    private double ratePerDay;
    private double milesPerDay;

    //constructor
    public CarRental(String carModel, int days, double ratePerDay, double milesPerDay){
        //validate parameters
        if(carModel == null || carModel.length() == 0){
            throw new IllegalArgumentException("Invalid Input");
        }
        this.carModel = carModel;
        this.days = days;
        this.ratePerDay = ratePerDay;
        this.milesPerDay = milesPerDay;
    }

    /*getters */
    public String getCarModel() {
        return carModel;
    }

    public int getDays() {
        return days;
    }

    public double getMilesPerDay() {
        return milesPerDay;
    }

    public double getRatePerDay() {
        return ratePerDay;
    }



    public double totalRentalCost(){
        return this.ratePerDay * (double) this.days;
    }
    public double totalMilesAllowed() {
        return  this.milesPerDay * (double) this.days;
    }
}
