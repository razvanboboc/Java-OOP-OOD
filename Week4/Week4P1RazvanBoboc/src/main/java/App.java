import com.iquestgroup.remotelearning.DispatchOperator;
import com.iquestgroup.remotelearning.TaxiDriver;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<TaxiDriver> drivers = new ArrayList<TaxiDriver>();
        drivers.add(new TaxiDriver("Vlad"));
        DispatchOperator operator = new DispatchOperator("Dan", drivers);

        operator.dispatch("Calea Motilor nr. 6");
    }
}
