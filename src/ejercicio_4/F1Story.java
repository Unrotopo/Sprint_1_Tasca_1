package ejercicio_4;

public class F1Story extends Story {

    private String team;

    public F1Story(String headline, String team) {
        super(headline);
        this.team = team;
        this.setPrice(calculatePriceNews());
        this.setScore(calculateScoreNews());
    }

    public int calculatePriceNews() {
        int price = 100;
        if ("Ferrari".equals(this.team) || "Mercedes".equals(this.team)) {
            price += 50;
        }
        return price;
    }

    public int calculateScoreNews() {
        int score = 4;
        if ("Ferrari".equals(this.team) || "Mercedes".equals(this.team)) {
            score += 2;
        }
        return score;
    }
}
