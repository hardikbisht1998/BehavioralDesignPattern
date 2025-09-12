package observerPattern;

public class DiscordObserver implements Observer{

    public String discordName;
    public DiscordObserver(String discordName){
        this.discordName=discordName;
    }
    @Override
    public void notified(String place) {
          System.out.println(discordName+" user Chances of high tide at "+place);
    }
}
