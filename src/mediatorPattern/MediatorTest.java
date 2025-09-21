package mediatorPattern;

public class MediatorTest {

    public void check() {
        AuctionHouse auctionHouse = new AuctionHouse("HorseAuctionHouseOfIndia");

        Bidder bidder = new Bidder(auctionHouse, "hardik");
        Bidder bidder1 = new Bidder(auctionHouse, "Gautam");
        Bidder bidder2 = new Bidder(auctionHouse, "Ritik");
        bidder.raiseBid("210000");
        bidder1.raiseBid("310000");

    }
}
