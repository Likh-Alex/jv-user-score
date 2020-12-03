package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {

        for (String userRecord : records) {
            String[] userEmailAndScore = userRecord.split(":");
            if (userEmailAndScore[0].equals(email)) {
                return Integer.parseInt(userEmailAndScore[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
