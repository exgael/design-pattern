package behavioral.observer.basicStyle;

public class Chart implements Observer{

    @Override
    public void update() {
        System.out.println("Chat got updated");
    }
}
