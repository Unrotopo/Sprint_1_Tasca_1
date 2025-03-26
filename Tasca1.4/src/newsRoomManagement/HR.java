package newsRoomManagement;

import entities.Editor;

import java.util.ArrayList;
import java.util.Scanner;

import static newsRoomManagement.Editorial.editors;

public class HR {

    private static Scanner sc = new Scanner(System.in);

    public static void createEditor(String name, String id) {
        Editor editor = new Editor(name, id);
        editors.add(editor);
    }

    public static void deleteEditor(String id) {
        editors.removeIf(editor -> editor.getId().equals(id));
    }

    public static Editor findEditor(String id) {
        for (Editor editor : new ArrayList<>(editors)) {
            if (editor.getId().equals(id)) {
                return editor;
            }
        }
        System.out.println("I think the Id may be wrong! Could you write it again?");
        String newId = sc.nextLine();
        return findEditor(newId);
    }
}
