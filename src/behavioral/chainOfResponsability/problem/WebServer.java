package behavioral.chainOfResponsability.problem;

public class WebServer {
    public void handle(HttpRequest request) {
        // Authentification
        var authenticator  = new Authentificator();
        authenticator.authenticate(request);
        // Logging
        // Compression
    }
}
