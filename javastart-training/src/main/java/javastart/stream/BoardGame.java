package javastart.stream;

public class BoardGame {
    private String gamename;
    private double price;
    private int players;
    private int maxAge;
    private int minAge;
    private double discount;

    public BoardGame(String gamename, double price, int players, int maxAge, int minAge, double discount) {
        this.gamename = gamename;
        this.price = price;
        this.players = players;
        this.maxAge = maxAge;
        this.minAge = minAge;
        this.discount = discount;
    }

    public String getGamename() {
        return gamename;
    }

    public double getPrice() {
        return price;
    }

    public int getPlayers() {
        return players;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public int getMinAge() {
        return minAge;
    }

    public double getDiscount() {
        return discount;
    }
}
