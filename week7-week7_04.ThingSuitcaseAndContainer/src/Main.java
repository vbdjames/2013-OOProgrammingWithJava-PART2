
public class Main {

    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 1; i <= 100; i++) {
            Thing thing = new Thing("brick", i);
            Suitcase suitcase = new Suitcase(1000);
            suitcase.addThing(thing);
            container.addSuitcase(suitcase);
        }
        // adding 100 suitcases with one brick in each
    }
}
