package education;

public class UserContext {
    private User user;

    public UserContext(User user) {
        this.user = user;
    }

    public UserContext(){

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}



