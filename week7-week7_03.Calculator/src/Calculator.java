
public class Calculator {
    private Reader reader;
    private int calculationsDone;

    public Calculator() {
        this.reader = new Reader();
        this.calculationsDone = 0;
    }
    
    public void start() {
        while (true) {
            System.out.println("command: ");
            String command = this.reader.readString();

            if (command.equals("end")) {
                break;
            }
            
            this.calculationsDone++;
            
            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            } else {
                this.calculationsDone--;
            }
        }

        statistics();
    }

    private void sum() {
        int[] values = getValues();
        System.out.println("sum of the values " + (values[0] + values[1]));
    }

    private void difference() {
        int[] values = getValues();
        System.out.println("difference of the values " + (values[0] - values[1]));
    }

    private void product() {
        int[] values = getValues();
        System.out.println("product of the values " + (values[0] * values[1]));
    }

    private void statistics() {
        System.out.println("Calculations done " + this.calculationsDone);
    }
    
    private int[] getValues() {
        int[] values = new int[2];
        
        System.out.print("value1: ");
        values[0] = reader.readInteger();
        System.out.print("value2: ");
        values[1] = reader.readInteger();
        return values;
    }
}
