package observerPattern;

public interface HighTideWarningSystem {

    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void sendWarning(String place);
}
