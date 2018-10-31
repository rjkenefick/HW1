class Car extends Vehicle {
    public Boolean isConvertible = false;
    public Boolean fourwheel = false ;

    public Car(int Year, int price, int MPG, String make, String model,Boolean isConvertible ,Boolean fourwheel) {
        super(Year, price, MPG, make, model  );
    }

    public Car() {

    }
    public void setFourwheel1 (boolean isfourwheel1 ){
        this.fourwheel = isfourwheel1;
    }


    public void setIsConvertible (boolean isConvertible ){
        this.isConvertible = isConvertible;
    }

    @Override
    public String toString() {
        return (super.toString()
                +(fourwheel ? "" :"")
                + (isConvertible ? "" :""));
    }
}