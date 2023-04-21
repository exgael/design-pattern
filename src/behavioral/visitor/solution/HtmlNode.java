package behavioral.visitor.solution;

@FunctionalInterface
public interface HtmlNode {
    void execute(Operation operation);
}
