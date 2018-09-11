class Car extends Vehicle {
    public Boolean isConvertible = false;
    public Boolean fourwheel = false ;
    public Car(int Year, int price, int MPG, String make, String model,Boolean isConvertible ,Boolean fourwheel) {
        super(Year, price, MPG, make, model  );
    }

    @Override
    public String toString() {
        return (super.toString()
                +"\n"
                +(fourwheel ? "is not a FWD" :"is FWD")
                +"\n"
                + (isConvertible ? "is not a convertible" :"is a convertible"));
    }
}