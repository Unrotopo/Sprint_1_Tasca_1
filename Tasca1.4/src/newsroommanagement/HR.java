package newsroommanagement;

import objects.Editor;

import static newsroommanagement.Editorial.editors;

public class HR {

    public static void createEditor(String name, String id) {
        Editor editor = new Editor(name, id);
        editors.add(editor);
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
