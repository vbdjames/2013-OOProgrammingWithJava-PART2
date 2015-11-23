
import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> loans;

    public PromissoryNote() {
        this.loans = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value) {
        this.loans.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose) {
        Double amt = this.loans.get(whose);
        if (amt == null) {
            return new Double(0.0);
        }
        return amt;
    }
}
