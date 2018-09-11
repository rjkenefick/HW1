class Truck extends Vehicle {
    public int tweight ;
    public Boolean sidestep = false;
    public Boolean fourwheel1 = false;

    public Truck(int Year, int price, int MPG, String make, String model ,int tweight , Boolean sidestep ,Boolean fourwheel1) {
        super(Year, price, MPG, make, model);
        this.tweight = tweight;
    }

    public void setTweight ( int newValue ){
        tweight = newValue;

    }

    @Override
    public String toString() {
        return (super.toString() + "\n"
                + ( fourwheel1 ? "does not have 4WD." :"is 4WD."))
                +"\n"
                + (sidestep ? "does not have a side step." :"has sidestep.")
                +"\n"
                + "Can tow up to " + tweight + "tons.";

    }

}