package observerPattern;

import java.time.Instant;

public class HighTideAlert {
    private final String location;
    private final double probability; // 0.0 to 1.0
    private final Instant timestamp;

    public HighTideAlert(String location, double probability, Instant timestamp) {
        if (location == null || location.isBlank()) throw new IllegalArgumentException("location required");
        if (probability < 0 || probability > 1) throw new IllegalArgumentException("probability in [0,1]");
        this.location = location;
        this.probability = probability;
        this.timestamp = timestamp == null ? Instant.now() : timestamp;
    }

    public String getLocation()    { return location; }
    public double getProbability() { return probability; }
    public Instant getTimestamp()  { return timestamp; }
}
