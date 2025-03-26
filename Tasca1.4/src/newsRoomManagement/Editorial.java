package newsRoomManagement;

import entities.Editor;
import entities.Story;
import entities.storyCategories.*;

import java.util.ArrayList;
import java.util.Scanner;

import static newsRoomManagement.HR.*;

public class Editorial {

    public static ArrayList<Editor> editors = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static final String DEMANDID = "Enter the Id of the Editor:";
    public static final String DEMANDHEADLINE = "Enter the headline of the story:";

    public static void deleteStory(String editorId, String headline) {
        int id = findEditor(editorId);
        Editor editor = editors.get(id);
        for (int i = 0; i < editor.getStoryList().size(); i++) {
            if (editor.getStoryList().get(i).getHeadline().equals(headline)) {
                editor.getStoryList().remove(i);
            }
        }
    }

    public static void addStory(String editorId, String headline) {
        int option;
        Editor editor = editors.get(findEditor(editorId));

        System.out.println("""
                Choose the type of story:
                1. Football
                2. Basket
                3. F1
                4. Tennis
                5. Motorcycling
                0. Exit
                """);
        option = sc.nextInt();

        switch (option) {
            case 1:
                addFootballStory(editor, headline);

            case 2:
                addBasketStory(editor, headline);

            case 3:
                addF1Story(editor, headline);

            case 4:
                addTennisStory(editor, headline);

            case 5:
                addMotorcycingStory(editor, headline);

            case 0:
                System.out.println("Let's go back.");
        }
    }

    public static void editorialWorkflow() {
        int option;

        System.out.println("""
                ----  NotFakeNews   ----
                Please, select an option:
                1. Add an editor
                2. Remove an editor
                3. Give a story to an editor
                4. Delete a story
                5. Show all the stories of a given editor
                6. Calculate a story's score
                7. Calculate a story's price
                0. Exit
                """);
        option = sc.nextInt();

        switch (option) {
            case 1:
                addEditor();

            case 2:
                removeEditor();

            case 3:
                giveNewStoryToEditor();

            case 4:
                removeStory();

            case 5:
                showAllStoriesFromEditor();

            case 6:
                calculateStorysScore();

            case 7:
                calculateStorysPrice();
        }
    }


    public static void addEditor() {
        System.out.println("Enter the name of the editor:");
        String name = sc.nextLine();
        System.out.println(DEMANDID);
        String id = sc.nextLine();
        createEditor(name, id);
        System.out.println("Editor added successfully\n");
    }

    public static void removeEditor() {
        System.out.println(DEMANDID);
        String id = sc.nextLine();
        deleteEditor(id);
    }

    public static void giveNewStoryToEditor() {
        System.out.println(DEMANDID);
        String id = sc.nextLine();
        System.out.println(DEMANDHEADLINE);
        String headline = sc.nextLine();
        addStory(id, headline);
        System.out.println("Story added successfully\n");
    }

    public static void removeStory() {
        System.out.println(DEMANDID);
        String id = sc.nextLine();
        System.out.println(DEMANDHEADLINE);
        String headline = sc.nextLine();
        deleteStory(id, headline);
        System.out.println("Story deleted successfully\n");
    }

    public static void showAllStoriesFromEditor() {
        System.out.println(DEMANDID);
        String id = sc.nextLine();
        Editor editor = editors.get(findEditor(id));
        editor.getStories();
    }

    public static void calculateStorysScore() {
        System.out.println(DEMANDID);
        String id = sc.nextLine();
        Editor editor = editors.get(findEditor(id));
        System.out.println(DEMANDHEADLINE);
        String headline = sc.nextLine();
        int score = editor.getStory(headline).calculateScoreNews();
        System.out.println("This story's score is " + score + " points.\n");
}

    public static void calculateStorysPrice() {
        System.out.println(DEMANDID);
        String id = sc.nextLine();
        Editor editor = editors.get(findEditor(id));
        System.out.println(DEMANDHEADLINE);
        String headline = sc.nextLine();
        int price = editor.getStory(headline).calculatePriceNews();
        System.out.println("This story's price is " + price + "€.\n");
    }


    public static void addFootballStory(Editor editor, String headline) {
        System.out.println("Enter the competition:");
        String competition = sc.nextLine();
        System.out.println("Enter the club:");
        String club = sc.nextLine();
        System.out.println("Enter the player:");
        String player = sc.nextLine();

        Story story = new FootballStory(headline, competition, club, player);
        editor.addStory(story);
    }

    public static void addBasketStory(Editor editor, String headline) {
        System.out.println("Enter the competition:");
        String competition = sc.nextLine();
        System.out.println("Enter the club:");
        String club = sc.nextLine();

        Story story = new BasketStory(headline, competition, club);
        editor.addStory(story);
    }

    public static void addF1Story(Editor editor, String headline) {
        System.out.println("Enter the team:");
        String team = sc.nextLine();

        Story story = new F1Story(headline, team);
        editor.addStory(story);
    }

    public static void addTennisStory(Editor editor, String headline) {
        System.out.println("Enter the competition:");
        String competition = sc.nextLine();
        System.out.println("Enter the player:");
        String player = sc.nextLine();

        Story story = new TennisStory(headline, competition, player);
        editor.addStory(story);
    }

    public static void addMotorcycingStory(Editor editor, String headline) {
        System.out.println("Enter the team:");
        String team = sc.nextLine();

        Story story = new MotorcyclingStory(headline, team);
        editor.addStory(story);
    }
}
