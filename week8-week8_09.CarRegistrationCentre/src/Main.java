
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // below is the same examle program as in the assignment

        RegistrationPlate plate1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate plate2 = new RegistrationPlate("D", "B WQ-431");
        VehicleRegister reg = new VehicleRegister();
        
        reg.add(plate1, "Arto");
        reg.add(plate2, "Jürgen");
        
        System.out.println(reg.delete(plate1));

    }
}
