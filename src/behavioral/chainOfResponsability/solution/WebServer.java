package behavioral.chainOfResponsability.solution;

public class WebServer {

    private Handler handler;

    public WebServer(Handler handler) {
        if (handler == null)
            throw new IllegalArgumentException("Handler cannot be null");
        this.handler = handler;
    }

    public void handle(HttpRequest request) {
        handler.handle(request);
    }
}
