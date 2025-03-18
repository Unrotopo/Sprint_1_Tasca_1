package objects;

import java.util.ArrayList;

public class  Editor {

    private final String name;
    private final String id;
    private static double salary = 1500;
    public ArrayList<Story> storyList = new ArrayList<>();

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


    public void getStories() {
        System.out.println("The editor is working on:\n");
        for (Story story : storyList) {
            System.out.println(story.getHeadline());
        }
        System.out.println();
    }

    public Story getStory(String headline) {
        for (Story story : storyList) {
            if (story.getHeadline().equals(headline)) {
                return story;
            }
        }
        return null;
    }
}
