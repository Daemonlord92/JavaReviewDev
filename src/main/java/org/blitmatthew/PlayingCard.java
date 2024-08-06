package org.blitmatthew;

public class PlayingCard {
    private String suit;
    private String type;

    public PlayingCard(String suit, String type) {
        this.suit = suit;
        this.type = type;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PlayingCard{" +
                "suit='" + suit + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
