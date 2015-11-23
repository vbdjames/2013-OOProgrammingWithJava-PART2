
import java.util.ArrayList;

public class Container {

    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Container(int maximumWeight) {
        this.suitcases = new ArrayList<Suitcase>();
        this.maximumWeight = maximumWeight;
    }

    public String toString() {
        String description = "";
        switch (this.suitcases.size()) {
            case 0:
                description = "empty";
                break;
            case 1:
                description = "1 suitcase";
                break;
            default:
                description = this.suitcases.size() + " suitcases";
        }

        return description + " (" + totalWeight() + " kg)";
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }

    private int totalWeight() {
        int weight = 0;
        for (Suitcase suitcase : suitcases) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }

}
