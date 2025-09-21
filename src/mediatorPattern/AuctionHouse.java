package mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class AuctionHouse implements Mediator {
    String name;
    private List<User> bidders;

    public AuctionHouse(String name) {
        this.name = name;
        this.bidders = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User bidder : bidders) {
            if (bidder != user) {
                bidder.recieveBid(message);
            }
        }
    }



    @Override
    public void register(User user) {
        if (!bidders.contains(user)) {
            bidders.add(user);
        }
    }
}
