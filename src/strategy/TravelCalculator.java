package strategy;

public class TravelCalculator {
    Cost costCalculator;

    public void setCostCalculator(Cost costCalculator) {
        this.costCalculator = costCalculator;
    }

    public int travelExpense(int distance , int time){
        return costCalculator.calculateFare( distance , time);
    }
}
