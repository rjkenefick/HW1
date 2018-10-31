import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.List;
import java.io.File;
import org.apache.commons.io.FileUtils;




import java.util.Arrays;
import java.io.Serializable;

public class Dealer implements Serializable {

    public Inventory loadWebData() throws IOException {
        Inventory inventory = new Inventory();


        Dealer dealer = new Dealer();
        URL oracle = new URL("https://raw.githubusercontent.com/kyungsooim/TestData/master/data/SeptemberInventory.txt");
        String inputLine;
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

        while ((inputLine = in.readLine()) != null) {

            String[] items = inputLine.split(",");
            List<String> itemList = Arrays.asList(items);
            String[] items1 = itemList.get(0).split(" ");

            if (itemList.contains("TRUE")) {

                Truck truck1 = new Truck(Integer.parseInt(itemList.get(1)), Integer.parseInt(itemList.get(2)), 0, items1[0], items[1], 0, false, false);
                inventory.add(truck1);
                System.out.println(truck1);

            } else {
                Car car1 = new Car(Integer.parseInt(itemList.get(1)), Integer.parseInt(itemList.get(2)), 0, items1[1], items1[0], false, false);
                inventory.add(car1);
                System.out.println(car1);
            }

        }
        in.close();

        return inventory;
    }

    public void generateReport (Inventory inv) throws IOException {
        File file = new File("~/Desktop/Testfile.txt");
       if (inv != null) {
           FileUtils.writeStringToFile(new File("~/Desktop/Testfile.txt"),FileUtils.getTempDirectoryPath());
       }
       else if (false ) {
           FileUtils.writeStringToFile(new File("~/Desktop/Testfile.txt"),FileUtils.getTempDirectoryPath());
            }
          }
       }

