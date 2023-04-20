package behavioral.templateMethode;

import behavioral.templateMethode.solution.TransferMoneyTask;

public class Main {
    public static void main(String[] args) {
        var task = new TransferMoneyTask();
        // task.doExecute();  <- protected therefore cannot access it!
        task.execute(); // <- this is the template method
    }
}
