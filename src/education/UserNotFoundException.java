package education;

public class UserNotFoundException extends RuntimeException {



    @Override
    public String getMessage() {
        return "could not fine user";
    }
}




