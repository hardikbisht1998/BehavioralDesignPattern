package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class DOfFishery implements HighTideWarningSystem {
    List<Observer> subscriber=new ArrayList<>();


    @Override
    public void subscribe(Observer observer) {
        subscriber.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
         subscriber.remove(observer);
    }

    @Override
    public void sendWarning(String place) {
        for(Observer observer:subscriber){
            observer.notified(place);
        }

    }
}
