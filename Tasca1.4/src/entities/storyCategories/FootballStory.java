package entities.storyCategories;

import entities.Story;

public class FootballStory extends Story {

    private final String competition;
    private final String club;
    private final String player;

    public FootballStory(String headline, String competition, String club, String player) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.player = player;
        this.setPrice(calculatePriceNews());
        this.setScore(calculateScoreNews());
    }

    @Override
    public int calculatePriceNews() {
        int price = 300;
        if ("Lliga de Champions".equals(this.competition)) {
            price += 100;
        }
        if ("Barça".equals(this.club) || "Madrid".equals(this.club)) {
            price += 100;
        }
        if ("Ferran Torres".equals(this.player) || "Benzema".equals(this.player)) {
            price += 50;
        }
        return price;
    }

    @Override
    public int calculateScoreNews() {
        int score = 5;
        if ("Lliga de Champions".equals(this.competition)) {
            score += 3;
        } else if ("Lliga".equals(this.competition)) {
            score += 2;
        }
        if ("Barça".equals(this.club) || "Madrid".equals(this.club)) {
            score += 1;
        }
        if ("Ferran Torres".equals(this.player) || "Benzema".equals(this.player)) {
            score += 1;
        }
        return score;
    }

}
