import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        // Greeting and group info
        System.out.println("Hello Customer! Thank you for eating at our restaurant!");
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int numPeople = scan.nextInt();

        // asks for tip percentage
        System.out.print("What is the tip percentage, (0-100): ");
        int tipPercentage = scan.nextInt();

        // object created
        TipCalculator tipCalculator = new TipCalculator(numPeople, tipPercentage);

        // user adds meal costs which gets added onto the totalBillBeforeTip until the user inputs -1
        double cost = 0;
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, (enter -1 when done): ");
            cost = scan.nextDouble();
            tipCalculator.addMeal(cost);
        }
        tipCalculator.addMeal(1); // adds 1 to negate the -1 that was added

        // prints all the receipt information for the user
        System.out.println("-----------------------------------------");
        System.out.println("Total Bill Without Tip: " + formatter.format(tipCalculator.getTotalBillBeforeTip()) + "$");
        System.out.println("Tip Percentage: " + tipCalculator.getTipPercentage());
        System.out.println("Total Tip: " + formatter.format(tipCalculator.tipAmount()) + "$");
        System.out.println("Total Bill With Tip: " + formatter.format(tipCalculator.totalBill()) + "$");
        System.out.println("Cost Per Person Before Tip: " + formatter.format(tipCalculator.perPersonCostBeforeTip()) + "$");
        System.out.println("Tip Per Person: " + formatter.format(tipCalculator.perPersonTipAmount()) + "$");
        System.out.println("Total Cost Per Person: " + formatter.format(tipCalculator.perPersonTotalCost()) + "$");
        System.out.println("-----------------------------------------");
    }
}
