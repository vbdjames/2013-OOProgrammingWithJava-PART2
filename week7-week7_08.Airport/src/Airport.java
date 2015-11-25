
import java.util.ArrayList;
import java.util.HashMap;

public class Airport {
    private HashMap<String,Airplane> airplanes;
    private ArrayList<Flight> flights;

    public Airport() {
        this.airplanes = new HashMap<String, Airplane>();
        this.flights = new ArrayList<Flight>();
    }

    
    public void addAirplane(String id, int cap) {
        this.airplanes.put(id, new Airplane(id, cap));
    }

    public void addFlight(String id, String departure, String destination) {
        Airplane airplane = this.airplanes.get(id);
        this.flights.add(new Flight(airplane, departure, destination));
    }

    public ArrayList<String> getPlanes() {
        ArrayList<String> planeStrings = new ArrayList<String>();
        for (String key : this.airplanes.keySet()) {
            planeStrings.add(this.airplanes.get(key).toString());
        }
        return planeStrings;
    }

    public String getPlaneInfo(String id) {
        return this.airplanes.get(id).toString();
    }
    
    public ArrayList<String> getFlights() {
        ArrayList<String> flightStrings = new ArrayList<String>();
        for (Flight flight : this.flights) {
            flightStrings.add(flight.toString());
        }
        return flightStrings;
    }

}
