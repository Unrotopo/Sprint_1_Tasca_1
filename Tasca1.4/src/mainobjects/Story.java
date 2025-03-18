package mainobjects;

import storyobjects.*;
import java.util.Scanner;

import static mainobjects.Editor.findEditor;

public abstract class Story {

    private static final Scanner sc = new Scanner(System.in);
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

    public static void deleteStory(String editorId, String headline) {
        int id = findEditor(editorId);
        Editor editor = editors.get(id);
        for (int i = 0; i < editor.storyList.size(); i++) {
            if (editor.storyList.get(i).headline.equals(headline)) {
                editor.storyList.remove(i);
            }
        }
    }

    public static void addStory(String editorId, String headline) {
        int option;
        int id = findEditor(editorId);
        Editor editor = editors.get(id);
        Story story;
        String competition;
        String club;
        String player;
        String team;

        do {
            System.out.println("""
                    Choose the type of story:
                    1. Football
                    2. Basket
                    3. F1
                    4. Tennis
                    5. Motorcycling
                    """);
            option = sc.nextInt();


            if (option == 1) {
                System.out.println("Enter the competition:");
                competition = sc.next();
                System.out.println("Enter the club:");
                club = sc.next();
                System.out.println("Enter the player:");
                player = sc.next();
                story = new FootballStory(headline, competition, club, player);
                editor.addStory(story);
                break;

            } else if (option == 2) {
                System.out.println("Enter the competition:");
                competition = sc.next();
                System.out.println("Enter the club:");
                club = sc.next();
                story = new BasketStory(headline, competition, club);
                editor.addStory(story);
                break;

            } else if (option == 3) {
                System.out.println("Enter the team:");
                team = sc.next();
                story = new F1Story(headline, team);
                editor.addStory(story);
                break;

            } else if (option == 4) {
                System.out.println("Enter the competition:");
                competition = sc.next();
                System.out.println("Enter the player:");
                player = sc.next();
                story = new TennisStory(headline, competition, player);
                editor.addStory(story);
                break;

            } else if (option == 5) {
                System.out.println("Enter the team:");
                team = sc.next();
                story = new MotorcyclingStory(headline, team);
                editor.addStory(story);
                break;
            }
        } while (true);
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public String getHeadline() {
        return headline;
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
