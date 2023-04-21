package behavioral.visitor.problem;

public interface HtmlNode {
    void highlight();
    // String plainText(); <- if this is added, needs to be imp everywhere :( like highlight
    // violates open-close principle
}
