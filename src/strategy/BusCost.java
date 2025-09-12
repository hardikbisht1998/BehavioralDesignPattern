package strategy;

public class BusCost implements Cost {
    int busFare = 10;  //10 rs per km
    int busFixedCost = 50;
    int timeCost = 10;   //1rp per second

    @Override
    public int calculateFare(int distance, int time) {
        return distance * busFare + busFixedCost + time * timeCost;
    }


}
