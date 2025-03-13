package ejercicio_4;

import java.util.ArrayList;

import static ejercicio_4.Main.editors;

public class Editor {

    private final String name;
    private final String id;
    private static double salary = 1500;
    ArrayList<Story> storyList = new ArrayList<>();


    public Editor(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public static double setSalary(int increase) {
        return salary += increase;
    }

    public static double getSalary() {
        return salary;
    }

    public String getId() {
        return this.id;
    }

    public void addStory(Story story) {
        this.storyList.add(story);
    }

    public Story getStory(String headline) {
        for (Story story : storyList) {
            if (story.getHeadline().equals(headline)) {
                return story;
            }
        }
        return null;
    }

    public void getStories() {
        System.out.println("The editor is working on:\n");
        for (Story story : storyList) {
            System.out.println(story.getHeadline());
        }
        System.out.println();
    }

    public static void deleteEditor(String id) {
        int foundId = -1;
        for (int i = 0; i < editors.size(); i++) {
            if (editors.get(i).getId().equals(id)) {
                foundId = i;
                break;
            }
        }
        if (foundId == -1) {
            System.out.println("Editor not found");
        } else {
            editors.remove(foundId);
            System.out.println("Editor deleted successfully");
        }
    }

    public static void createEditor(String name, String id) {
        Editor editor = new Editor(name, id);
        editors.add(editor);
    }

    public static int findEditor(String id) {
        int foundId = -1;
        for (int i = 0; i < editors.size(); i++) {
            if (editors.get(i).getId().equals(id)) {
                foundId = i;
                break;
            }
        }
        if (foundId == -1) {
            System.out.println("Editor not found");
            return 0;
        } else {
            return foundId;
        }
    }
}
