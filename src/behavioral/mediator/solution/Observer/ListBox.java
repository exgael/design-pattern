package behavioral.mediator.solution.Observer;

public class ListBox extends UIControl {
    private String selection;

    public ListBox() {
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyEventHandlers();
    }
}
