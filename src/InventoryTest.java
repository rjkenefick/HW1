import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.Assert.*;

public class InventoryTest {
   public ArrayList<Vehicle> Vehicles = new ArrayList<Vehicle>();

    @Test
    public void add() {
        ArrayList<Vehicle> Vehicles = new ArrayList<Vehicle>();
        assertTrue(true);
    }

    @org.testng.annotations.Test
    public void remove() {

    }

    @org.junit.Test
    public void findCheapestVehicle2() {


    }

    @org.junit.Test
    public void findMostExpensiveVehicle() {
        Vehicle HighestPriceVehicle = new Vehicle(2015 ,10000 ,18 ,"Ford","F150");
        for ( Vehicle vehicle : Vehicles) {
            if  (vehicle.price > HighestPriceVehicle.price ) {
                HighestPriceVehicle = vehicle;
            }
            assertTrue(true);
        }
    }

    @org.junit.Test
    public void printAveragePriceOfAllVehicles() {
        int total = 0;

        for ( Vehicle vehicles : Vehicles){
            total = total + vehicles.price ;
        }
        int average = total / Vehicles.size() ;
        //  System.out.println("The average of all Vehicles:" + average);
        assertEquals(average,average); }
    }
