package newsroommanagement;

import objects.Editor;
import objects.Story;
import objects.storyobjects.*;

import java.util.ArrayList;
import java.util.Scanner;

import static newsroommanagement.HR.*;

public class Editorial {

    public static ArrayList<Editor> editors = new ArrayList<>();

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
        int id = findEditor(editorId);
        Scanner sc = new Scanner(System.in);
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

    public static void editorialWorkflow() {
        int option;
        do {
            Scanner sc = new Scanner(System.in);
            String name;
            String id;
            String headline;
            String demandId = "Enter the ID of the editor:";
            String demandHeadline = "Enter the headline of the story:";

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

            if (option == 1) {
                System.out.println("Enter the name of the editor:");
                name = sc.next();
                System.out.println(demandId);
                id = sc.next();
                createEditor(name, id);
                System.out.println("Editor added successfully\n");

            } else if (option == 2) {
                System.out.println(demandId);
                id = sc.next();
                deleteEditor(id);

            } else if (option == 3) {
                System.out.println(demandId);
                id = sc.next();
                System.out.println(demandHeadline);
                headline = sc.next();
                addStory(id, headline);
                System.out.println("Story added successfully\n");

            } else if (option == 4) {
                System.out.println(demandId);
                id = sc.next();
                System.out.println(demandHeadline);
                headline = sc.next();
                deleteStory(id, headline);
                System.out.println("Story deleted successfully\n");

            } else if (option == 5) {
                System.out.println(demandId);
                id = sc.next();
                Editor editor = editors.get(findEditor(id));
                editor.getStories();

            } else if (option == 6) {
                System.out.println(demandId);
                id = sc.next();
                Editor editor = editors.get(findEditor(id));
                System.out.println(demandHeadline);
                headline = sc.next();
                int score = editor.getStory(headline).calculateScoreNews();
                System.out.println("This story's score is " + score + " points.\n");

            } else if (option == 7) {
                System.out.println(demandId);
                id = sc.next();
                Editor editor = editors.get(findEditor(id));
                System.out.println(demandHeadline);
                headline = sc.next();
                int price = editor.getStory(headline).calculatePriceNews();
                System.out.println("This story's price is " + price + "€.\n");
            }
        } while (option != 0);
    }
}
