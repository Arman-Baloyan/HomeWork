package education;
import java.util.HashMap;
import java.util.Map;

public class UserStorageMap {


        private Map<String, User> userMap = new HashMap<>();

        public void add(User user) {
            if (getUserByEmail(user.getEmail()) == null){
                userMap.put(user.getEmail(), user);
            }
        }

        public User getUserByEmail(String email){
            for(String key : userMap.keySet()) {
                if (key.equals(email)) {
                    return userMap.get(email);
                }
            }
            return null;
        }


    }


