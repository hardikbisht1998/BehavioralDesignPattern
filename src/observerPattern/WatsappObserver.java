package observerPattern;

public class WatsappObserver implements Observer{
    public String phoneNo;

    public WatsappObserver(String phoneNo){
        this.phoneNo=phoneNo;
    }


    @Override
    public void notified(String place) {
        System.out.println(phoneNo +" user there is high chance of tide at "+place);
    }
}
