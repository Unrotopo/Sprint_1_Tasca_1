package ejercicio_4;

public class TennisStory extends Story {

    private String competition;
    private String player;

    public TennisStory(String headline, String competition, String player) {
        super(headline);
        this.competition = competition;
        this.player = player;
        this.setPrice(calculatePriceNews());
        this.setScore(calculateScoreNews());
    }

    public int calculatePriceNews() {
        int price = 150;
        if ("Federer".equals(this.player) || "Djokovic".equals(this.player) || "Nadal".equals(this.player)) {
            price += 100;
        }
        return price;
    }

    public int calculateScoreNews() {
        int score = 4;
        if ("Federer".equals(this.player) || "Djokovic".equals(this.player) || "Nadal".equals(this.player)) {
            score += 3;
        }
        return score;
    }
}
