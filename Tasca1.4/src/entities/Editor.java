package entities;

import java.util.ArrayList;
import java.util.List;

public class  Editor {

    private final String name;
    private final String id;
    private static double salary = 1500;
    private final ArrayList<Story> storyList;

    public Editor(String name, String id) {
        this.name = name;
        this.id = id;
        this.storyList = new ArrayList<>();
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

    public List<Story> getStoryList() {
        return this.storyList;
    }

    public void addStory(Story story) {
        getStoryList().add(story);
    }


    public void getStories() {
        System.out.println("The editor is working on:\n");
        for (Story story : getStoryList()) {
            System.out.println(story.getHeadline());
        }
        System.out.println();
    }

    public Story getStory(String headline) {
        for (Story story : getStoryList()) {
            if (story.getHeadline().equals(headline)) {
                return story;
            }
        }
        return null;
    }
}
