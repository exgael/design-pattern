package behavioral.mediator.solution.basic;

public class Button extends  UIControl{
    private boolean isEnabled;

    public Button(DialogBox owner) {
        super(owner);
    }
    
    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
    
    
}
