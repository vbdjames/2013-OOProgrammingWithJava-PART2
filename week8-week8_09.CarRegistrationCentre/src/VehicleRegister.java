
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (this.owners.get(plate) == null) {
            this.owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        return this.owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        String owner = this.owners.remove(plate);
        return (owner != null);
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : this.owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<String>();

        for (RegistrationPlate plate : this.owners.keySet()) {
            String owner = this.owners.get(plate);

            if (!ownerList.contains(owner)) {
                ownerList.add(this.owners.get(plate));
            }
        }

        for (String owner : ownerList) {
            System.out.println(owner);
        }
    }
}
