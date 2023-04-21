package behavioral.observer.pushStyle;

public class DataSource extends Subject<Integer> {
    private int value;

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
        notifyObservers(value);
    }
}
    

