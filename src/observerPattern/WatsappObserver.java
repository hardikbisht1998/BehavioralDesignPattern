package observerPattern;

public class WatsappObserver implements Observer{
    private final String phoneNo;

    public WatsappObserver(String phoneNo){
        this.phoneNo=phoneNo;
    }


    @Override
    public void onAlert(HighTideAlert alert) {
        System.out.printf("WhatsApp -> %s: High tide %.0f%% at %s [%s]%n",
                phoneNo, alert.getProbability() * 100, alert.getLocation(), alert.getTimestamp());
    }
}
