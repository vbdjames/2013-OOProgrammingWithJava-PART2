
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> things;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.things = new ArrayList<Thing>();
        this.maximumWeight = maximumWeight;
    }

    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= this.maximumWeight) {
            this.things.add(thing);
        }
    }

    @Override
    public String toString() {
        String description = "";
        switch (this.things.size()) {
            case 0:
                description = "empty";
                break;
            case 1:
                description = "1 thing";
                break;
            default:
                description = this.things.size() + " things";
        }

        return description + " (" + totalWeight() + " kg)";
    }
    
    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }
    
    public Thing heaviestThing() {
        Thing heaviest = null;
        for (Thing thing : things) {
            if (heaviest == null || thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }
        return heaviest;
    }

}
