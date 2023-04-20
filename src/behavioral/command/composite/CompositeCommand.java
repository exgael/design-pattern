package behavioral.command.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command{

    private List<Command> commands = new ArrayList<>();

    // add commands to the list 
    public  void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (var command : commands) {
            command.execute();
        }
    }
}
