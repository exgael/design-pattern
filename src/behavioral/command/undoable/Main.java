package behavioral.command.undoable;

import behavioral.command.undoable.editor.BoldCommand;
import behavioral.command.undoable.editor.History;
import behavioral.command.undoable.editor.HtmlDocument;

public class Main {
    public static void main(String[] args) {
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());
        
        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
