package ejercicio_4;

public class BasketStory extends Story {

    private String competition;
    private String club;

    public BasketStory(String headline, String competition, String club) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.setPrice(calculatePriceNews());
        this.setScore(calculateScoreNews());
    }

    public int calculatePriceNews() {
        int price = 250;
        if ("Eurolliga".equals(this.competition)) {
            price += 75;
        }
        if ("Barça".equals(this.club) || "Madrid".equals(this.club)) {
            price += 75;
        }
        return price;
    }

    public int calculateScoreNews() {
        int score = 250;
        if ("Eurolliga".equals(this.competition)) {
            score += 3;
        } else if ("ACB".equals(this.competition)) {
            score += 2;
        }
        if ("Barça".equals(this.club) || "Madrid".equals(this.club)) {
            score += 1;
        }
        return score;
    }
}
