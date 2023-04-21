package behavioral.observer.pushStyle;

// Do not know anything about the data source class
public class SpreadSheet implements Observer<Integer> {

    @Override
    public void update(Integer value) {
        System.out.println("Spreadsheet got updated : " + value);
    }
}
