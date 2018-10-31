import jdk.nashorn.api.scripting.URLReader;
import sun.text.resources.FormatData;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.lang.Exception;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {

        Dealer dealer = new Dealer();
        Inventory inventory = new Inventory();

        inventory = dealer.loadWebData();

        dealer.generateReport(inventory);








        }
}
