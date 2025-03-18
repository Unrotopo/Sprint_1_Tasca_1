package ejercicio_4;

public class FootballStory extends Story {

    private String competition;
    private String club;
    private String player;

    public FootballStory(String headline, String competition, String club, String player) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.player = player;
        this.setPrice(calculatePriceNews());
        this.setScore(calculateScoreNews());
    }

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
