package main;

import survivalzombie.EditorView;

/**
 *
 * @author Jose Suresh Alejo
 * @author Alberto Ruíz
 */
public class Main {
    
    private static EditorView editor;

    public static void main(String[] args) {
        
        editor = new EditorView();
        editor.setVisible(true);
        new controller.Controller(editor);
    }
}
