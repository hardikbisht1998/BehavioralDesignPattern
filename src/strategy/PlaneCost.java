package strategy;

public class PlaneCost implements Cost{

    int planeFare = 50;  //10 rs per km
    int planeFixedCost = 550;
    int timeCost = 1;   //1rp per second

    @Override
    public int calculateFare(int distance, int time) {
        return distance * planeFare + planeFixedCost + time * timeCost;
    }
}
