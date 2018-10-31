class Truck extends Vehicle {
    public int tweight ;
    public Boolean sidestep = false;
    public Boolean fourwheel1 = true;

    public Truck(int Year, int price, int MPG, String make, String model ,int tweight , Boolean sidestep ,Boolean fourwheel1) {
        super(Year, price, MPG, make, model);
        this.tweight = tweight;
    }

    public Truck() {
        super();
    }


    public void setTweight ( int newValue ){
        tweight = newValue;

    }

    public void setFourwheel1 (boolean isfourwheel1 ){
       this.fourwheel1 = isfourwheel1;
    }

    @Override
    public String toString() {
        return (super.toString() + "\n"
                + ( fourwheel1 ? " " :"True"))
                + (sidestep ? "" :"True");

    }

}