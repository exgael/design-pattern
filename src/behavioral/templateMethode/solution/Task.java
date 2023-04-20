package behavioral.templateMethode.solution;

import behavioral.templateMethode.problem.AuditTrail;

public abstract class Task {
    private AuditTrail auditTrail;


    public Task() { this.auditTrail = new AuditTrail(); }

    // The arg AuditTrail would be an interface
    // Decouples the Auditrail from the Task class
    public Task(AuditTrail auditTrail) { this.auditTrail = auditTrail; }

    public void execute() {
        auditTrail.record();
        doExecute();
    }

    // protected keyword is really important.
    // Hides the methods within this class,
    // but allows subclasses to access them
    protected abstract void doExecute();
}
