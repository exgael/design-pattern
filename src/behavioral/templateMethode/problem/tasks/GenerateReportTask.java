package behavioral.templateMethode.problem.tasks;

import behavioral.templateMethode.problem.AuditTrail;

public class GenerateReportTask {
    private AuditTrail  auditTrail;

    public GenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();

        // logic for generating the report
        System.out.println("Generate Report");
    }
}
