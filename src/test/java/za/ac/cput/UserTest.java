//Author Asiphe Funda 215092317


package za.ac.cput;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @Disabled
    public void testObjectEquality() {
        User u1 = new User("123","password");
        User u2 = new User("123","password");
        assertEquals(u1,u2);

    }
    @Test
    public void testObjectIdentity(){
        User u1 = new User("123","password");
        User u2 = new User("123","password");
        assertNotSame(u1, u2);

    }

    @Test
    public void testInequality(){
        User u1 = new User("123","password");
        User u2 = new User("52","My login");
        assertNotEquals(u1, u2);
    }
    @Test
    @Timeout(50)
    public void testTimeout(){
        User user = new User("123","password");
        for(int i = 0; i<500000000; i++){
            user.setLoginId("User"+1);
        }
    }
    @Test
    public void test_fail(){
        fail("This test fails because someone was lazy");
        //User u = User.createUser( "", "User_password");
        //System.out.println(u.toString());
        //assertNotNull(u);
    }
}