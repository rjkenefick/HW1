import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Inventory implements Serializable {


    ArrayList<Vehicle> Vehicles = new ArrayList<Vehicle>(); // in a way its a global variable  that can be used anywhere in the Inventory class.

    public void add(Vehicle vehicle ){ //Method
        Vehicles.add(vehicle);
    }
    public void remove(Vehicle vehicle2remove){ //Method
        Vehicles.remove(vehicle2remove);
    }

    public Vehicle findCheapestVehicle2(){
        if (Vehicles.isEmpty()) {

        }
        Vehicle lowestPriceVehicle = null;
        for ( Vehicle vehicle : Vehicles) {
            if (lowestPriceVehicle == null) {
                lowestPriceVehicle = vehicle;
            }
            else if (vehicle.price < lowestPriceVehicle.price ) {
                lowestPriceVehicle = vehicle;
            }
        }
        return lowestPriceVehicle ;
    }
    public Vehicle findMostExpensiveVehicle(){
        Vehicle HighestPriceVehicle = new Vehicle(2015 ,10000 ,18 ,"Ford","F150");
        for ( Vehicle vehicle : Vehicles) {
            if  (vehicle.price > HighestPriceVehicle.price ) {
                HighestPriceVehicle = vehicle;
            }
        }
        return HighestPriceVehicle ;
    }
    public int printAveragePriceOfAllVehicles (){
        int total = 0;

        for ( Vehicle vehicles : Vehicles){
            total = total + vehicles.price ;
        }
        int average = total / Vehicles.size() ;

        return average; }

}
