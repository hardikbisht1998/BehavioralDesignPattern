package observerPattern;

import java.util.concurrent.CopyOnWriteArrayList;

public class DOfFishery implements HighTideWarningSystem {
    private final CopyOnWriteArrayList<Observer> subscribers = new CopyOnWriteArrayList<>();


    @Override
    public void subscribe(Observer observer) {
        if (observer != null) {
            subscribers.addIfAbsent(observer);
        }
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void send(HighTideAlert alert) {
        for (Observer o : subscribers) {
            try {
                o.onAlert(alert);
            } catch (Exception ex) {
                System.err.println("Observer failed: " + o + " reason: " + ex.getMessage());
            }
        }

    }
}
