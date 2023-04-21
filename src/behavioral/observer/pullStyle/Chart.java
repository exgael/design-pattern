package behavioral.observer.pullStyle;

public class Chart implements Observer{

    private DataSource  dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chat got updated : " + dataSource.getValue());
    }
}
