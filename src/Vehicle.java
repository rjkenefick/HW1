class Vehicle {
    public int Year;
    public String make;
    public String model;
    public int price;
    public int MPG;
    public Vehicle(int Year, int price, int MPG, String make, String model) {
        this.Year = Year;
        this.price = price;
        this.MPG = MPG;
        this.model = model;
        this.make = make;
    }

    public String toString() {
        return ( Year + " " +  make+ " "+ model
                +"\n"
                +"$"+ price
                +"\n"
                +"MPG:"+ MPG );
    }
}