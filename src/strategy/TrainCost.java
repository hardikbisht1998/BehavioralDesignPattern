package strategy;

public class TrainCost implements Cost {

    int trainFare = 20;  //10 rs per km
    int trainFixedCost = 250;
    int timeCost = 3;   //1rp per second

    @Override
    public int calculateFare(int distance, int time) {
        return distance * trainFare + trainFixedCost + time * timeCost;
    }
}
