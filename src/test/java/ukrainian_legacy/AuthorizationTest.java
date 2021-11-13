package ukrainian_legacy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {

    Authorization authorization = new Authorization();
    DataBase dataBase = new DataBase();
    @Test
    void authorize() {
        assertTrue(authorization.authorize(dataBase));
    }
}