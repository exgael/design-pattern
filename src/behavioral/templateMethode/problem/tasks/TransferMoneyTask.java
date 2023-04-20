package behavioral.templateMethode.problem.tasks;

import behavioral.templateMethode.problem.AuditTrail;

public class TransferMoneyTask {

    private AuditTrail auditTrail;

    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();

        // logic for transferring money between accoutns
        System.out.println("Transfer money");
    }
}
