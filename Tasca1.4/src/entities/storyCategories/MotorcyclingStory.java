package entities.storyCategories;

import entities.Story;

public class MotorcyclingStory extends Story {

    private final String team;

    public MotorcyclingStory(String headline, String team) {
        super(headline);
        this.team = team;
        this.setPrice(calculatePriceNews());
        this.setScore(calculateScoreNews());
    }

    @Override
    public int calculatePriceNews() {
        int price = 100;
        if ("Honda".equals(this.team) || "Yamaha".equals(this.team)) {
            price += 50;
        }
        return price;
    }

    @Override
    public int calculateScoreNews() {
        int score = 3;
        if ("Honda".equals(this.team) || "Yamaha".equals(this.team)) {
            score += 3;
        }
        return score;
    }
}
