package fixtures.user;

import builders.user.UserBuilder;
import models.User;

public class UserFixture {

    public static User DEFAULT_USER(){
        return new UserBuilder()
                .withUsername("USERN")
                .withPassword("PASSWD")
                .build();
    }
}
