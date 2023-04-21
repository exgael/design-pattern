package behavioral.mediator.solution.Observer;

public class Button extends  UIControl{
    private boolean isEnabled;

    public Button() {
    }
    
    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }
    
    
}
