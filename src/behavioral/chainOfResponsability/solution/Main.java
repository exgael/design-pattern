package behavioral.chainOfResponsability.solution;

public class Main {
    public static void main(String[] args) {
        // authenticate -> log -> compresse -> encrypt
        var encryptor = new Encryptor(null);
        var compressor = new Compressor(encryptor);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        

        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));
        System.out.println("");
        server.handle(new HttpRequest("-", "1234"));
    }
}
