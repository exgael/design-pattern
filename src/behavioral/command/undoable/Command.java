package behavioral.command.undoable;

@FunctionalInterface
public interface Command {
    void execute();
}
