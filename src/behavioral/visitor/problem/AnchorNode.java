package behavioral.visitor.problem;

public class AnchorNode implements HtmlNode {

    @Override
    public void highlight() {
        System.out.println("Highlighting anchor");
    }
    
}
