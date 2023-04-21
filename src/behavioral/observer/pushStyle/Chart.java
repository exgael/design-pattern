package behavioral.observer.pushStyle;

public class Chart implements Observer<Integer>{

    @Override
    public void update(Integer value) {
        System.out.println("Chat got updated : " + value);
    }
}
