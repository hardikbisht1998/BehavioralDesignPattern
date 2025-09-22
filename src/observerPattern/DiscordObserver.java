package observerPattern;

public class DiscordObserver implements Observer{

    private final String username;

    public DiscordObserver(String username) {
        this.username = username;
    }


    @Override
    public void onAlert(HighTideAlert alert) {
        System.out.printf("Discord (%s): High tide %.0f%% at %s [%s]%n",
                username, alert.getProbability() * 100, alert.getLocation(), alert.getTimestamp());
    }
}
