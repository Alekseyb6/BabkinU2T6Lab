public class TipCalculator {
    // instance variables
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    // constructor
    public TipCalculator(int numPeople, int tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    // getter methods
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    // adds a meal cost to the totalBillBeforeTip
    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    // calculates the tip amount and returns it
    public double tipAmount() {
        return totalBillBeforeTip * ((double) tipPercentage / 100);
    }

    // total bill including the tip amount
    public double totalBill() {
        return (double) totalBillBeforeTip + tipAmount();
    }

    // the cost per person excluding the tip
    public double perPersonCostBeforeTip() {
        return (double) totalBillBeforeTip / numPeople;
    }

    // tip amount per person
    public double perPersonTipAmount() {
        return (double) tipAmount() / numPeople;
    }

    // the total cost per person including the tip amount
    public double perPersonTotalCost() {
        return (double) totalBill() / numPeople;
    }
}
