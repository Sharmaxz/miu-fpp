package problem3;

public final record hotelBooking(String hotelName, int nights, double pricePerNight){
    //  //hotelName, nights, pricePerNight
    //  private String hotelName;
    //  private int nights;
    //  private double pricePerNight;

    //  public hotelBooking(String hotelName, int nights, int pricePerNight){
    //     this.hotelName = hotelName;
    //     this.nights = nights;
    //     this.pricePerNight = pricePerNight;
    //  }

     public double totalCost(){
        return  this.pricePerNight * (double) this.nights;
     }
}
