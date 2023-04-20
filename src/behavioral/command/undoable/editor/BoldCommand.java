package behavioral.command.undoable.editor;

import behavioral.command.undoable.UndoableCommand;

public class BoldCommand implements UndoableCommand {

    private String prevContent; // store prevState incase of undo
    private HtmlDocument document;
    private History history;

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = document.getContent(); // store prevState incase of undo
        document.makeBold();
        history.push(this); // push this command to history
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent); // restore prevState
    }
}
