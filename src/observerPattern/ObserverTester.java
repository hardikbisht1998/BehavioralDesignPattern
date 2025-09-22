package observerPattern;

import java.time.Instant;

public class ObserverTester {
    public void check() {
        HighTideWarningSystem pub = new DOfFishery();
        Observer w1 = new WatsappObserver("+91-828395147");
        Observer d1 = new DiscordObserver("coast_guard_bot");

        pub.subscribe(w1);
        pub.subscribe(d1);

        pub.send(new HighTideAlert("Chennai Marina", 0.85, Instant.now()));
        pub.unsubscribe(d1);
        pub.send(new HighTideAlert("Pondicherry Promenade", 0.60, Instant.now()));
    }
}
