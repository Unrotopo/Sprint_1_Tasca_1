package ejercicio_4;

import java.util.ArrayList;
import java.util.Scanner;

import static ejercicio_4.Editor.*;
import static ejercicio_4.Story.*;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    static ArrayList<Editor> editors = new ArrayList<>();

    public static void main(String[] args) {

        int option;
        String name;
        String id;
        String headline;
        String demandId = "Enter the ID of the editor:";
        String demandHeadline = "Enter the headline of the story:";

        do {
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

