
import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private Airport airport;

    public UserInterface(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;
    }

    public void start() {
        airportPanel();
        flightServicePanel();
    }

    private void airportPanel() {
        System.out.println("");
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        while (true) {
            String operation = promptAirportOperation();
            if (operation.equals("x")) {
                break;
            } else if (operation.equals("1")) {
                addAirplane();
            } else if (operation.equals("2")) {
                addFlight();
            } else {
                System.out.println("Invalid operation!");
            }
        }
    }

    private void flightServicePanel() {
        System.out.println("");
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        while (true) {
            String operation = promptFlightOperation();
            if (operation.equals("x")) {
                break;
            } else if (operation.equals("1")) {
                printPlanes();
            } else if (operation.equals("2")) {
                printFlights();
            } else if (operation.equals("3")) {
                printPlaneInfo();
            } else {
                System.out.println("Invalid operation!");
            }
        }
    }

    private String promptAirportOperation() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        return this.reader.nextLine();
    }

    private String promptFlightOperation() {
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        return this.reader.nextLine();
    }

    private void addAirplane() {
        String id = promptString("Give plane ID: ");
        int cap = promptInt("Give plane capacity: ");
        this.airport.addAirplane(id, cap);
    }

    private void addFlight() {
        String id = promptString("Give plane ID: ");
        String departure = promptString("Give departure airport code: ");
        String destination = promptString("Give destination airport code: ");
        this.airport.addFlight(id, departure, destination);
    }

    private void printPlanes() {
        System.out.println(this.airport.getPlanes());
    }

    private void printFlights() {
        System.out.println(this.airport.getFlights());
    }

    private void printPlaneInfo() {
        String id = promptString("Give plane ID: ");
        System.out.println(this.airport.getPlaneInfo(id));
    }

    private String promptString(String prompt) {
        System.out.print(prompt);
        return this.reader.nextLine();
    }

    private int promptInt(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(this.reader.nextLine());
    }

}
