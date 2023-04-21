package behavioral.chainOfResponsability.problem;

public class Authentificator {
    public boolean authenticate(HttpRequest request) {
        var isValid = (request.getUsername() == "admin" &&
                request.getPassword() == "1234");

        System.out.println("Authentication status: " + isValid);

        return isValid;
    }
}
