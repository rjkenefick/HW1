import sun.text.resources.FormatData;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ArrayList<Vehicle> Vehicles = new ArrayList<Vehicle>();
        Vehicles.add (new Truck(2015 ,35000,18 ,"Ford","F150",2 , true ,true ));
        Vehicles.add(new Car(2015,20000,35,"Mazda","Speed 3",false,false));
        for ( Vehicle vehicle : Vehicles) {
            System.out.println(vehicle.toString());
            System.out.println("");
           }
        }
    }
