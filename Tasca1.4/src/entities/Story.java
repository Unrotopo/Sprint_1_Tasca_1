package entities;

public abstract class Story {

    private final String headline;
    private String body;
    private int score;
    private int price;

    protected Story(String headline) {
        this.headline = headline;
        this.body = "";
    }

    public abstract int calculatePriceNews();
    public abstract int calculateScoreNews();


    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public String getHeadline() {
        return this.headline;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
