package education;

public class UserStorage {
    private User[] users = new User[15];
    private int size = 0;

    public void add(User user) {
        if (users.length == size) {
            extend();
        }
        if (!user.equals(getUserByEmail(user.getEmail()))) {
            users[size++] = user;
        } else System.out.println("User already exists!");
    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        users = tmp;
    }

    public User getUserByEmail(String email)throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
    }
}
