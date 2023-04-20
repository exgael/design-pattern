package behavioral.memento;

import java.util.Stack;

public class History {

    private final Stack<EditorState> stack = new Stack<>();

    
    public void push(EditorState state) {
        stack.push(state);
    }

    public EditorState pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("History is empty");
        }
        
        if (stack.isEmpty()) {
            return null;
        }
        
        return stack.pop();
    }

}
    

